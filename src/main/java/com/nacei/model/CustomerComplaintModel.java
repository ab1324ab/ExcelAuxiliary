package com.nacei.model;

import com.github.crab2died.annotation.ExcelField;

/**
 * 当前客诉表
 * 2019年5月14日09:29:15
 */
public class CustomerComplaintModel {

    @ExcelField(title = "投诉日期", order = 1)
    private String dateOfComplaint;

    @ExcelField(title = "帐号", order = 1)
    private String accounts;

    @ExcelField(title = "站点", order = 1)
    private String site;

    @ExcelField(title = "单号", order = 1)
    private String orderNumber;

    @ExcelField(title = "类别", order = 1)
    private String category;

    @ExcelField(title = "客诉分类", order = 1)
    private String customerComplaintClassification;

    @ExcelField(title = "SKU", order = 1)
    private String SKU;

    @ExcelField(title = "购买日期", order = 1)
    private String dateOfPurchase;

    @ExcelField(title = "数量", order = 1)
    private String number;

    @ExcelField(title = "投诉原因", order = 1)
    private String causeOfComplaint;

    @ExcelField(title = "处理结果", order = 1)
    private String processingResult;

    @ExcelField(title = "质检解决方案", order = 1)
    private String qualityInspectionSolution;

    @ExcelField(title = "产品解决方案", order = 1)
    private String productSolutions;

    @ExcelField(title = "客诉图片", order = 1)
    private String customerComplaintPictures;

    @ExcelField(title = "备注", order = 1)
    private String remarks;

    @ExcelField(title = "录入人", order = 1)
    private String entryPerson;

    public String getDateOfComplaint() {
        return dateOfComplaint;
    }

    public void setDateOfComplaint(String dateOfComplaint) {
        this.dateOfComplaint = dateOfComplaint;
    }

    public String getAccounts() {
        return accounts;
    }

    public void setAccounts(String accounts) {
        this.accounts = accounts;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCustomerComplaintClassification() {
        return customerComplaintClassification;
    }

    public void setCustomerComplaintClassification(String customerComplaintClassification) {
        this.customerComplaintClassification = customerComplaintClassification;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCauseOfComplaint() {
        return causeOfComplaint;
    }

    public void setCauseOfComplaint(String causeOfComplaint) {
        this.causeOfComplaint = causeOfComplaint;
    }

    public String getProcessingResult() {
        return processingResult;
    }

    public void setProcessingResult(String processingResult) {
        this.processingResult = processingResult;
    }

    public String getQualityInspectionSolution() {
        return qualityInspectionSolution;
    }

    public void setQualityInspectionSolution(String qualityInspectionSolution) {
        this.qualityInspectionSolution = qualityInspectionSolution;
    }

    public String getProductSolutions() {
        return productSolutions;
    }

    public void setProductSolutions(String productSolutions) {
        this.productSolutions = productSolutions;
    }

    public String getCustomerComplaintPictures() {
        return customerComplaintPictures;
    }

    public void setCustomerComplaintPictures(String customerComplaintPictures) {
        this.customerComplaintPictures = customerComplaintPictures;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getEntryPerson() {
        return entryPerson;
    }

    public void setEntryPerson(String entryPerson) {
        this.entryPerson = entryPerson;
    }
}
