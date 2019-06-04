package com.nacei.model;

import com.github.crab2died.annotation.ExcelField;

/**
 * 退货分析表
 */
public class RetailReturnRateAnalysisModel {

    @ExcelField(title = "产品类别", order = 1)
    private String productCategory;

    @ExcelField(title = "数量", order = 1)
    private String number;

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
