package com.nacei.model;

import com.github.crab2died.annotation.ExcelField;

/**
 * 退货详情表
 */
public class RetailReturnRateModel {

    @ExcelField(title = "SKU", order = 1)
    private String SKU;

    @ExcelField(title = "数量", order = 1)
    private String number;

    @ExcelField(title = "币种", order = 1)
    private String currency;

    @ExcelField(title = "金额", order = 1)
    private String money;

    @ExcelField(title = "客诉", order = 1)
    private String customerComplaint;

    @ExcelField(title = "原因分析", order = 1)
    private String causeAnalysis;

    @ExcelField(title = "产品类别", order = 1)
    private String productCategory;

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getCustomerComplaint() {
        return customerComplaint;
    }

    public void setCustomerComplaint(String customerComplaint) {
        this.customerComplaint = customerComplaint;
    }

    public String getCauseAnalysis() {
        return causeAnalysis;
    }

    public void setCauseAnalysis(String causeAnalysis) {
        this.causeAnalysis = causeAnalysis;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
}
