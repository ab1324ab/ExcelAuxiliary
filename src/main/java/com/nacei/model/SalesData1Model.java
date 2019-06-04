package com.nacei.model;

import com.github.crab2died.annotation.ExcelField;

public class SalesData1Model {

    @ExcelField(title = "商品类别", order = 1)
    private String commodityCategory;

    @ExcelField(title = "SKU", order = 1)
    private String SKU;

    @ExcelField(title = "产品名称", order = 1)
    private String productName;

    @ExcelField(title = "产品开发员", order = 1)
    private String productDeveloper;

    @ExcelField(title = "成本价", order = 1)
    private String costPrice;

    @ExcelField(title = "当月总销量", order = 1)
    private String totalSalesForTheMonth;

    @ExcelField(title = "当月销售额", order = 1)
    private String salesForTheMonth;

    public String getCommodityCategory() {
        return commodityCategory;
    }

    public void setCommodityCategory(String commodityCategory) {
        this.commodityCategory = commodityCategory;
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
        this.costPrice = costPrice;
    }

    public String getTotalSalesForTheMonth() {
        return totalSalesForTheMonth;
    }

    public void setTotalSalesForTheMonth(String totalSalesForTheMonth) {
        this.totalSalesForTheMonth = totalSalesForTheMonth;
    }

    public String getSalesForTheMonth() {
        return salesForTheMonth;
    }

    public void setSalesForTheMonth(String salesForTheMonth) {
        this.salesForTheMonth = salesForTheMonth;
    }
}
