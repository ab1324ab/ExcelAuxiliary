package com.nacei.business;

import com.github.crab2died.ExcelUtils;
import com.github.crab2died.exceptions.Excel4JException;
import com.github.crab2died.sheet.wrapper.NoTemplateSheetWrapper;
import com.nacei.ExcelReadService;
import com.nacei.model.*;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

public class RetailReturnRateAnalysisTableBusiness {

    // 退货详单1
    private List<OutReturndetails1Model> outReturndetails1Models = new ArrayList<OutReturndetails1Model>();
    // 获取退货分析
    private List<RetailReturnRateAnalysisModel> retailReturnRateAnalysisModels = new ArrayList<RetailReturnRateAnalysisModel>();
    // 退货详单2
    private List<OutReturndetails2Model> outReturndetails2Models = new ArrayList<OutReturndetails2Model>();
    // 退货详单3
    private List<OutReturndetails2Model> outReturndetails3Models = new ArrayList<OutReturndetails2Model>();
    // 销售数据表1
    private List<SalesData1Model> salesData1Models = new ArrayList<SalesData1Model>();
    // 销售数据表2
    private List<SalesData2Model> salesData2Models = new ArrayList<SalesData2Model>();

    /**
     * 退货详单1
     * @return
     */
    public List<OutReturndetails1Model> getReturndetails1(){
        if(outReturndetails1Models.size() != 0){
            return outReturndetails1Models;
        }
        Map<String, List> map = ExcelReadService.getMap();
        List<RetailReturnRateModel> returnRates = map.get(RetailReturnRateModel.class.toString());
        List<CustomerComplaintModel> complaints = map.get(CustomerComplaintModel.class.toString());

        List<OutReturndetails1Model> outReturndetails1s = new ArrayList<OutReturndetails1Model>();
        for(RetailReturnRateModel rate : returnRates){
            OutReturndetails1Model returndetails1 = new OutReturndetails1Model();
            returndetails1.setProductCategory(rate.getProductCategory());
            returndetails1.setSKU(rate.getSKU());
            returndetails1.setBuyer(this.getEnglishBuyer(rate.getSKU()));
            returndetails1.setCauseAnalysis(rate.getCauseAnalysis());
            returndetails1.setCustomerComplaint(rate.getCustomerComplaint());
            returndetails1.setNumber(rate.getNumber());
            outReturndetails1s.add(returndetails1);
        }
        for (CustomerComplaintModel complaint : complaints){
            OutReturndetails1Model returndetails1 = new OutReturndetails1Model();
            returndetails1.setProductCategory(complaint.getCategory());
            returndetails1.setSKU(complaint.getSKU());
            returndetails1.setBuyer(this.getEnglishBuyer(complaint.getSKU()));
            returndetails1.setCauseAnalysis(complaint.getCustomerComplaintClassification());
            returndetails1.setCustomerComplaint(complaint.getCauseOfComplaint());
            returndetails1.setNumber(complaint.getNumber());
            outReturndetails1s.add(returndetails1);
        }
        outReturndetails1Models.addAll(outReturndetails1s);
        return outReturndetails1Models;
    }

    /**
     * 获取退货分析
     * @return
     */
    public List<RetailReturnRateAnalysisModel> getRetailReturnRateAnalysis(){
        if(retailReturnRateAnalysisModels.size() != 0){
            return retailReturnRateAnalysisModels;
        }
        Map<String, List> map = ExcelReadService.getMap();
        retailReturnRateAnalysisModels.addAll(map.get(RetailReturnRateAnalysisModel.class.toString()));
        return retailReturnRateAnalysisModels;
    }

    /**
     * 退货详单2
     * @return
     */
    public List<OutReturndetails2Model> getReturndetails2(){
        if(outReturndetails2Models.size() != 0){
            return outReturndetails2Models;
        }
        // 销售数据2
        List<SalesData2Model> salesData2 = this.getSalesData2();
        // 退货详单1
        List<OutReturndetails1Model> modelList = this.getReturndetails1();
        Map<String,OutReturndetails2Model> modelMap = new HashMap<String, OutReturndetails2Model>();
        int otl = 0;
        for(OutReturndetails1Model model : modelList){
           otl = classification(modelMap,model,otl);
        }
        OutReturndetails2Model otlm = new OutReturndetails2Model();
        otlm.setProductCategory("总计");
        otlm.setBadNumber(String.valueOf(otl));
        modelMap.put("总计",otlm);
        List<OutReturndetails2Model> outReturndetails2ModelList = new ArrayList<OutReturndetails2Model>();
        for(SalesData2Model salesData2Model : salesData2){
            OutReturndetails2Model outReturndetails2Model = classificationReturnRate(modelMap,salesData2Model,otl);
            outReturndetails2ModelList.add(outReturndetails2Model);
        }
        outReturndetails2Models.addAll(outReturndetails2ModelList);
        return outReturndetails2Models;
    }

    /**
     * 退货详单3
     * @return
     */
    public List<OutReturndetails2Model> getReturndetails3(){
        if(outReturndetails3Models.size() != 0){
            return outReturndetails3Models;
        }
        // 销售数据2
        List<SalesData2Model> salesData2 = this.getSalesData2();
        // 退货详单1
        List<OutReturndetails1Model> modelList = this.getReturndetails1();
        Map<String,OutReturndetails2Model> modelMap = new HashMap<String, OutReturndetails2Model>();
        int otl = 0;
        for(OutReturndetails1Model model : modelList){
            if("品质问题".equals(model.getCauseAnalysis())){
                otl = classification(modelMap,model,otl);
            }
        }
        OutReturndetails2Model otlm = new OutReturndetails2Model();
        otlm.setProductCategory("总计");
        otlm.setBadNumber(String.valueOf(otl));
        modelMap.put("总计",otlm);
        List<OutReturndetails2Model> outReturndetails2ModelList = new ArrayList<OutReturndetails2Model>();
        for(SalesData2Model salesData2Model : salesData2){
            OutReturndetails2Model outReturndetails2Model = classificationReturnRate(modelMap,salesData2Model,otl);
            outReturndetails2ModelList.add(outReturndetails2Model);
        }
        outReturndetails3Models.addAll(outReturndetails2ModelList);
        return outReturndetails3Models;
    }

    /**
     * 销售数据表1
     * @return
     */
    public List<SalesData1Model> getSalesData1(){
        if(salesData1Models.size() != 0){
            return salesData1Models;
        }
        Map<String, List> map = ExcelReadService.getMap();
        List<ProductListModel> productLists = map.get(ProductListModel.class.toString());
        List<SalesOfNewProductsModel> sales = map.get(SalesOfNewProductsModel.class.toString());
        List<SalesData1Model> salesData1ModelList = new ArrayList<SalesData1Model>();
        for(SalesOfNewProductsModel productsModel :sales){
            if(productsModel.getSKU() == null || "".equals(productsModel.getSKU())){
                continue;
            }
            SalesData1Model salesData1Model = new SalesData1Model();
            for(ProductListModel productListModel :productLists){
                if(productListModel.getTradeSKU().equals(productsModel.getSKU())){
                    salesData1Model.setCommodityCategory(productListModel.getCommodityCategory());
                    if(productListModel.getBuyer().equals("0.0")){
                        salesData1Model.setProductDeveloper("sky");
                    }else{
                        salesData1Model.setProductDeveloper(productListModel.getBuyer());
                    }
                }
            }
            salesData1Model.setSKU(productsModel.getSKU());
            salesData1Model.setProductName(productsModel.getProductName());
            salesData1Model.setCostPrice(productsModel.getCostPrice());
            salesData1Model.setTotalSalesForTheMonth(productsModel.getTotalSalesForTheMonth());
            BigDecimal sav = new BigDecimal(productsModel.getSalesVolumeForTheMonth());
            BigDecimal rate = new BigDecimal(ExcelReadService.getRate());
            BigDecimal americanDollar = sav.divide(rate,2,BigDecimal.ROUND_HALF_UP);
            //americanDollar.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            salesData1Model.setSalesForTheMonth("$"+americanDollar);
            salesData1ModelList.add(salesData1Model);
        }
        salesData1Models.addAll(salesData1ModelList);
        return salesData1Models;
    }

    /**
     * 销售数据表2
     * @return
     */
    public List<SalesData2Model> getSalesData2(){
        if(salesData2Models.size() != 0){
            return salesData2Models;
        }
        List<SalesData1Model> salesData1ModelList = this.getSalesData1();
        //先分组
        Map<String,SalesData2Model> modelMap = new HashMap<String, SalesData2Model>();

        for(String strName : ExcelReadService.getPropertiesStrArr()) {
            if(strName == null || "".equals(strName)){
                continue;
            }
            SalesData2Model salesData2 = new SalesData2Model();
            salesData2.setCommodityCategory(strName);
            salesData2.setSKUcount(0);
            salesData2.setOtalSalesForThe("0");
            salesData2.setSalesForThe("0");
            modelMap.put(strName,salesData2);
        }
        for(SalesData1Model salesData1Model : salesData1ModelList){
            if(modelMap.get(salesData1Model.getCommodityCategory()) == null){
                continue;
            }
            SalesData2Model salesData2Model = modelMap.get(salesData1Model.getCommodityCategory());
            salesData2Model.setSKUcount(salesData2Model.getSKUcount()+1); // sku 个数
            BigDecimal otalSalesForThe = new BigDecimal(salesData1Model.getTotalSalesForTheMonth())
                    .add(new BigDecimal(salesData2Model.getOtalSalesForThe())).setScale(0,BigDecimal.ROUND_HALF_UP);
            salesData2Model.setOtalSalesForThe(otalSalesForThe.toString());
            BigDecimal salesForThe = new BigDecimal(salesData1Model.getSalesForTheMonth().replace("$",""))
                    .add(new BigDecimal(salesData2Model.getSalesForThe().replace("$",""))).setScale(2,BigDecimal.ROUND_HALF_UP);
            salesData2Model.setSalesForThe("$"+salesForThe.toString());
            modelMap.put(salesData1Model.getCommodityCategory(),salesData2Model);
        }
        int ota = 0;
        BigDecimal otalSalesForThe= new BigDecimal(0);
        BigDecimal otaSales = new BigDecimal(0);
        List<SalesData2Model> salesData2ModelList = new ArrayList<SalesData2Model>();
        for(Map.Entry<String,SalesData2Model> m :modelMap.entrySet()){
            ota += m.getValue().getSKUcount();
            otalSalesForThe = otalSalesForThe.add(new BigDecimal(m.getValue().getOtalSalesForThe()));
            otaSales = otaSales.add(new BigDecimal(m.getValue().getSalesForThe().replace("$",""))).setScale(2,BigDecimal.ROUND_HALF_UP);
            salesData2ModelList.add(m.getValue());
        }
        salesData2ModelList.add(new SalesData2Model("总计",ota,otalSalesForThe.toString(),"$"+otaSales.toString()));
        salesData2Models.addAll(salesData2ModelList);
        return salesData2Models;
    }

    /**
     * 获取详情单的采购人 方法
     * @param sku
     * @return
     */
    public String getEnglishBuyer(String sku){
        Map<String, List> map = ExcelReadService.getMap();
        List<ProductListModel> productLists = map.get(ProductListModel.class.toString());
        String split = sku;
        if(sku.indexOf("+") != -1){
            split = sku.split("\\+")[0];

        }else if(sku.indexOf("*") != -1){
            split = sku.split("\\*")[0];
        }
        for (ProductListModel productList : productLists){
            if(productList.getTradeSKU().equals(split)){
                if(productList.getBuyer().equals("0.0")){
                    return "sky";
                }else{
                    return productList.getBuyer();
                }
            }
        }
        return "";
    }

    /**
     * 分类产品名称
     * @param modelMap
     * @param model
     * @param otl
     * @return
     */
    public int classification(Map<String,OutReturndetails2Model> modelMap,OutReturndetails1Model model,int otl){
        if(modelMap.get(model.getProductCategory()) == null){
            OutReturndetails2Model outReturndetails3Model = new OutReturndetails2Model();
            outReturndetails3Model.setProductCategory(model.getProductCategory());
            outReturndetails3Model.setBadNumber(model.getNumber());
            otl += Integer.valueOf(model.getNumber());
            modelMap.put(model.getProductCategory(),outReturndetails3Model);
        }else{
            int number = Integer.valueOf(modelMap.get(model.getProductCategory()).getBadNumber()) + Integer.valueOf(model.getNumber());
            otl += Integer.valueOf(model.getNumber());
            modelMap.get(model.getProductCategory()).setBadNumber(String.valueOf(number));
        }
        return otl;
    }

    /**
     * 分类退货率计算
     * @param modelMap
     * @param salesData2Model
     * @param otl
     * @return
     */
    public OutReturndetails2Model classificationReturnRate(Map<String,OutReturndetails2Model> modelMap,SalesData2Model salesData2Model,int otl){
        OutReturndetails2Model outReturndetails2Model = new OutReturndetails2Model();
        outReturndetails2Model.setProductCategory(salesData2Model.getCommodityCategory());
        String salesForThe = salesData2Model.getOtalSalesForThe();
        outReturndetails2Model.setSalesVolume("".equals(salesForThe)? "0" : salesForThe);
        if(null != modelMap.get(salesData2Model.getCommodityCategory())){
            String badNumber = modelMap.get(salesData2Model.getCommodityCategory()).getBadNumber();
            outReturndetails2Model.setBadNumber("".equals(badNumber)? "0" : badNumber);
            if(StringUtils.isNotEmpty(salesForThe) && StringUtils.isNotEmpty(badNumber) && !"0".equals(salesForThe)){
                BigDecimal bad = new BigDecimal(badNumber);
                BigDecimal sales = new BigDecimal(salesForThe);
                outReturndetails2Model.setReturnRate(bad.divide(sales,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100)).setScale(2,BigDecimal.ROUND_HALF_UP).toString()+"%");
            }else{
                outReturndetails2Model.setReturnRate("0.00%");
            }
            if(StringUtils.isNotEmpty(badNumber) && !"总计".equals(salesData2Model.getCommodityCategory())){
                BigDecimal bad = new BigDecimal(badNumber);
                BigDecimal otlb = new BigDecimal(otl);
                outReturndetails2Model.setReturnRatio(bad.divide(otlb,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100)).setScale(2,BigDecimal.ROUND_HALF_UP).toString()+"%");
            }else if("总计".equals(salesData2Model.getCommodityCategory())){
                outReturndetails2Model.setReturnRatio("");
            }else{
                outReturndetails2Model.setReturnRatio("0.00%");
            }
        }else{
            outReturndetails2Model.setBadNumber("0");
            outReturndetails2Model.setReturnRate("0.00%");
            outReturndetails2Model.setReturnRatio("0.00%");
        }
        return outReturndetails2Model;
    }

    public static void main(String[] args) throws Excel4JException, IOException {
       RetailReturnRateAnalysisTableBusiness reta = new RetailReturnRateAnalysisTableBusiness();
       List<NoTemplateSheetWrapper> sheets = new ArrayList<NoTemplateSheetWrapper>();

       List<RetailReturnRateAnalysisModel> rateAnalyses = reta.getRetailReturnRateAnalysis();
       sheets.add(new NoTemplateSheetWrapper(rateAnalyses, RetailReturnRateAnalysisModel.class, true, "退货分析" ));
       List<OutReturndetails1Model> list = reta.getReturndetails1();
       sheets.add(new NoTemplateSheetWrapper(list, OutReturndetails1Model.class, true, "退货详单1" ));
       List<OutReturndetails2Model> outReturndetails2ModelList = reta.getReturndetails2();
       sheets.add(new NoTemplateSheetWrapper(outReturndetails2ModelList, OutReturndetails2Model.class, true, "退货详单2" ));
       List<OutReturndetails2Model> outReturndetails3ModelList = reta.getReturndetails3();
       sheets.add(new NoTemplateSheetWrapper(outReturndetails3ModelList, OutReturndetails2Model.class, true, "退货详单3" ));
       List<SalesData1Model> salesData1 = reta.getSalesData1();
       sheets.add(new NoTemplateSheetWrapper(salesData1, SalesData1Model.class, true, "销售数据1" ));
       List<SalesData2Model> salesData2 = reta.getSalesData2();
       sheets.add(new NoTemplateSheetWrapper(salesData2, SalesData2Model.class, true, "销售数据2" ));

       ExcelUtils.getInstance().noTemplateSheet2Excel(sheets, "EE.xlsx");
    }
}
