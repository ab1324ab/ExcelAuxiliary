package com.nacei.model;

import com.github.crab2died.annotation.ExcelField;

public class SalesData2Model {

    @ExcelField(title = "商品类别", order = 1)
    private String commodityCategory;

    @ExcelField(title = "SKU个数", order = 1)
    private int SKUcount;

    @ExcelField(title = "总销量", order = 1)
    private String otalSalesForThe;

    @ExcelField(title = "销售额", order = 1)
    private String salesForThe;

    public SalesData2Model() {}

    public SalesData2Model(String commodityCategory, int SKUcount, String otalSalesForThe, String salesForThe) {
        this.commodityCategory = commodityCategory;
        this.SKUcount = SKUcount;
        this.otalSalesForThe = otalSalesForThe;
        this.salesForThe = salesForThe;
    }

    public String getCommodityCategory() {
        return commodityCategory;
    }

    public void setCommodityCategory(String commodityCategory) {
        this.commodityCategory = commodityCategory;
    }

    public int getSKUcount() {
        return SKUcount;
    }

    public void setSKUcount(int SKUcount) {
        this.SKUcount = SKUcount;
    }

    public String getOtalSalesForThe() {
        return otalSalesForThe;
    }

    public void setOtalSalesForThe(String otalSalesForThe) {
        this.otalSalesForThe = otalSalesForThe;
    }

    public String getSalesForThe() {
        return salesForThe;
    }

    public void setSalesForThe(String salesForThe) {
        this.salesForThe = salesForThe;
    }
}
