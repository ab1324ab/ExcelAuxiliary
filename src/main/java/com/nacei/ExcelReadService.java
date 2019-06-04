package com.nacei;

import com.github.crab2died.ExcelUtils;
import com.nacei.model.*;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.*;

public class ExcelReadService {

    private static String prostrs = "3c配件,包材配件,打猎相机,耳机,服饰类,服装类,工具电池,行车记录仪,户外用品,"+
            "婚庆家居,家居用品,美容类,迷你DVR,内窥镜,其它电子,其它非电子,启动电源,日用家居,"+
            "手机屏,投影仪,网络摄像机,饮食家居,游戏周边,运动DV,智能穿戴,VR眼镜,智能家居,"+
            "汽车用品,音箱,无人机,宠物类,理疗类,手机电池";
    private static String defaultRate = "6.65";
    private static Map<String,List> map = new HashMap<String, List>();
    private static String[] productArr = new String[]{};
    private static Properties properties = null;

    public static Map<String, List> getMap() {
        if(map.size() == 0){
            File file = new File("");// 参数为空
            String path = null;
            try {
                path = file.getCanonicalPath();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String complaintPath = path+"\\当前客诉.xls";
            String returnRatesPath = path+"\\零售退销率分析.xlsx";
            String productListsPath = path+"\\产品列表.xls";
            String salesPath = path+"\\新品销售量统计.xlsx";
//            String complaintPath = "C:\\Users\\hp\\Desktop\\文档\\当前客诉(2019-04-0104_04_58).xls";
//            String returnRatesPath = "C:\\Users\\hp\\Desktop\\文档\\零售退销率分析 (3).xlsx";
//            String productListsPath = "C:\\Users\\hp\\Desktop\\文档\\产品列表(2019-04-01 03_29_09).xls";
//            String salesPath = "C:\\Users\\hp\\Desktop\\文档\\新品销售量统计.xlsx";
            ExcelReadService excelRead = new ExcelReadService();
            map = excelRead.getExcelObject(complaintPath, returnRatesPath,productListsPath,salesPath);
        }
        return map;
    }

    /**
     * 获取数据源
     * @param complaintPath
     * @param returnRatesPath
     * @param productListsPath
     * @return
     */
    public Map<String,List> getExcelObject(String complaintPath,String returnRatesPath,String productListsPath,String salesPath){
        Map<String,List> map = new HashMap<String, List>();
        // 当前客诉
        List<CustomerComplaintModel> complaints = null;
        // 退货详单
        List<RetailReturnRateModel> returnRates = null;
        // 产品列表
        List<ProductListModel> productLists = null;
        // 退货分析
        List<RetailReturnRateAnalysisModel> rateAnalyses = null;
        // 新品销售量统计
        List<SalesOfNewProductsModel> sales = null;
        try {
            complaints = ExcelUtils.getInstance().readExcel2Objects(complaintPath, CustomerComplaintModel.class, 0, 0);
            rateAnalyses = ExcelUtils.getInstance().readExcel2Objects(returnRatesPath, RetailReturnRateAnalysisModel.class, 1, 0);
            returnRates = ExcelUtils.getInstance().readExcel2Objects(returnRatesPath, RetailReturnRateModel.class, 1, 1);
            productLists = ExcelUtils.getInstance().readExcel2Objects(productListsPath, ProductListModel.class, 0, 0);
            sales = ExcelUtils.getInstance().readExcel2Objects(salesPath, SalesOfNewProductsModel.class, 1, 0);
            map.put(CustomerComplaintModel.class.toString(),complaints);
            map.put(RetailReturnRateModel.class.toString(),returnRates);
            map.put(ProductListModel.class.toString(),productLists);
            map.put(RetailReturnRateAnalysisModel.class.toString(),rateAnalyses);
            map.put(SalesOfNewProductsModel.class.toString(),sales);
        }catch (FileNotFoundException e){
            try {
                String text = "\"当前客诉.xls\",\"零售退销率分析.xlsx\",\"产品列表.xls\",\"新品销售量统计.xlsx\"。";
                throw new IOException("系统找不到指定的文件:"+text);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 获取资源文件文件列表内容
     * @return
     * @throws Exception
     */
    public static String[] getPropertiesStrArr(){
        if(productArr.length != 0){
            return productArr;
        }
        String property = properties("productModel");
        if(StringUtils.isEmpty(property)){
            return prostrs.split(",");
        }
        productArr = property.split(",");
        return productArr;
    }

    /**
     * 设置产品列表
     * @param productValue
     */
    public static void setPropertiesStrArr(String productValue){
        properties("productModel",productValue);
    }

    /**
     * 获取汇率
     * @return
     */
    public static String getRate(){
        String rate = properties("rate");
        if(StringUtils.isEmpty(rate)){
            return defaultRate;
        }
        return rate;
    }

    /**
     * 设置汇率
     * @return
     */
    public static void setRate(String rateValue){
        properties("rate",rateValue);
    }

    /**
     * 获取资源文件内容
     * @param key
     * @return
     */
    public static String properties(String key){
        if(properties == null){
            properties = new Properties();
        }
        try {
            File file = new File("");// 参数为空;
            String path = file.getCanonicalPath();
            properties.load(new FileInputStream(new File(path+"\\prostrs.properties")));
        } catch (Exception e) {
            //e.printStackTrace();
        }
       return properties.getProperty(key);
    }

    /**
     * 设置资源文件内容
     * @param key
     * @return
     */
    public static void properties(String key,String value){
        if(properties == null){
            properties = new Properties();
        }
        try {
            File file = new File("");// 参数为空;
            try {
                file = new File(ExcelReadService.class.getResource("prostrs.properties").getPath());
            }catch (Exception e){
                String path = file.getCanonicalPath();
                file = new File(path+"/prostrs.properties");
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            properties.setProperty(key, value);
            //store方法，第一个参数是输入流，第二个是提示信息。#Sun Jan 07 18:47:58 CST 2018
            properties.store(fileOutputStream, new Date().toString());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
