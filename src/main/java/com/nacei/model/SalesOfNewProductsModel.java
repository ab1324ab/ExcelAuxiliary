package com.nacei.model;

import com.github.crab2died.annotation.ExcelField;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * 新品销售量统计
 */
public class SalesOfNewProductsModel {

    @ExcelField(title = "SKU", order = 1)
    private String SKU;

    @ExcelField(title = "产品名称", order = 1)
    private String productName;

    @ExcelField(title = "产品发布时间", order = 1)
    private String productReleaseTime;

    @ExcelField(title = "产品开发员", order = 1)
    private String productDeveloper;

    @ExcelField(title = "成本价", order = 1)
    private String costPrice;

    @ExcelField(title = "当月总销量", order = 1)
    private String totalSalesForTheMonth;

    @ExcelField(title = "当月销售额", order = 1)
    private String salesVolumeForTheMonth;

    @ExcelField(title = "中仓", order = 1)
    private String chineseWarehouse;

    @ExcelField(title = "美仓", order = 1)
    private String americanWarehouse;

    @ExcelField(title = "出口易英仓", order = 1)
    private String exportEasyBritishWarehouse;

    @ExcelField(title = "日本外仓", order = 1)
    private String japaneseWarehouse;

    @ExcelField(title = "BBM(德仓)", order = 1)
    private String BBM;

    @ExcelField(title = "FBA", order = 1)
    private String FBA;

    public String getChineseWarehouse() {
        return chineseWarehouse;
    }

    public void setChineseWarehouse(String chineseWarehouse) {
        this.chineseWarehouse = chineseWarehouse;
    }

    public String getAmericanWarehouse() {
        return americanWarehouse;
    }

    public void setAmericanWarehouse(String americanWarehouse) {
        this.americanWarehouse = americanWarehouse;
    }

    public String getExportEasyBritishWarehouse() {
        return exportEasyBritishWarehouse;
    }

    public void setExportEasyBritishWarehouse(String exportEasyBritishWarehouse) {
        this.exportEasyBritishWarehouse = exportEasyBritishWarehouse;
    }

    public String getJapaneseWarehouse() {
        return japaneseWarehouse;
    }

    public void setJapaneseWarehouse(String japaneseWarehouse) {
        this.japaneseWarehouse = japaneseWarehouse;
    }

    public String getBBM() {
        return BBM;
    }

    public void setBBM(String BBM) {
        this.BBM = BBM;
    }

    public String getFBA() {
        return FBA;
    }

    public void setFBA(String FBA) {
        this.FBA = FBA;
    }
    public String getSalesVolumeForTheMonth() {
        return salesVolumeForTheMonth;
    }

    public void setSalesVolumeForTheMonth(String salesVolumeForTheMonth) {
        this.salesVolumeForTheMonth = new BigDecimal(salesVolumeForTheMonth).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()+"";
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductReleaseTime() {
        return productReleaseTime;
    }

    public void setProductReleaseTime(String productReleaseTime) {
        this.productReleaseTime = productReleaseTime;
    }

    public String getProductDeveloper() {
        return productDeveloper;
    }

    public void setProductDeveloper(String productDeveloper) {
        this.productDeveloper = productDeveloper;
    }

    public String getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(String costPrice) {
        if(costPrice.indexOf("-") != -1){
            String c = costPrice.split(" ")[0];
            costPrice = c.replace("-","/");
        };
        this.costPrice = costPrice;
    }

    public String getTotalSalesForTheMonth() {
        return totalSalesForTheMonth;
    }

    public void setTotalSalesForTheMonth(String totalSalesForTheMonth) {
        this.totalSalesForTheMonth = totalSalesForTheMonth;
    }

}

