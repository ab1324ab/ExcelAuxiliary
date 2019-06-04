package com.nacei.model;

import com.github.crab2died.annotation.ExcelField;

public class OutReturndetails1Model {

    @ExcelField(title = "产品类别", order = 1)
    private String productCategory;

    @ExcelField(title = "SKU", order = 1)
    private String SKU;
    // 采购员
    @ExcelField(title = "采购员", order = 1)
    private String buyer;
    // 原因分析
    @ExcelField(title = "原因分析", order = 1)
    private String causeAnalysis;
    // 客诉
    @ExcelField(title = "客诉", order = 1)
    private String customerComplaint;
    // 数量
    @ExcelField(title = "数量", order = 1)
    private String number;

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getCauseAnalysis() {
        return causeAnalysis;
    }

    public void setCauseAnalysis(String causeAnalysis) {
        this.causeAnalysis = causeAnalysis;
    }

    public String getCustomerComplaint() {
        return customerComplaint;
    }

    public void setCustomerComplaint(String customerComplaint) {
        this.customerComplaint = customerComplaint;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
