package com.nacei.model;

import com.github.crab2died.annotation.ExcelField;

public class OutReturndetails2Model {

    @ExcelField(title = "产品类别", order = 1)
    private String productCategory;

    @ExcelField(title = "销量", order = 1)
    private String salesVolume;

    @ExcelField(title = "不良数", order = 1)
    private String badNumber;

    @ExcelField(title = "退货率", order = 1)
    private String returnRate;

    @ExcelField(title = "退货占比", order = 1)
    private String returnRatio;

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(String salesVolume) {
        this.salesVolume = salesVolume;
    }

    public String getBadNumber() {
        return badNumber;
    }

    public void setBadNumber(String badNumber) {
        this.badNumber = badNumber;
    }

    public String getReturnRate() {
        return returnRate;
    }

    public void setReturnRate(String returnRate) {
        this.returnRate = returnRate;
    }

    public String getReturnRatio() {
        return returnRatio;
    }

    public void setReturnRatio(String returnRatio) {
        this.returnRatio = returnRatio;
    }
}
