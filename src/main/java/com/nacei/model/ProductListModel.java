package com.nacei.model;

import com.github.crab2died.annotation.ExcelField;

public class ProductListModel {

    @ExcelField(title = "是否组合商品", order = 1)
    private String whetherToCombineCommoditiesOrNot;

    @ExcelField(title = "商品类别", order = 1)
    private String commodityCategory;

    @ExcelField(title = "商品名称", order = 1)
    private String tradeName;

    @ExcelField(title = "商品SKU", order = 1)
    private String tradeSKU;

    @ExcelField(title = "商品状态", order = 1)
    private String commodityStatus;

    @ExcelField(title = "商品描述", order = 1)
    private String commodityDescription;

    @ExcelField(title = "商品等级", order = 1)
    private String commodityGrade;

    @ExcelField(title = "商品编码", order = 1)
    private String commodityCode;

    @ExcelField(title = "材料", order = 1)
    private String materialScience;

    @ExcelField(title = "规格", order = 1)
    private String specifications;

    @ExcelField(title = "型号", order = 1)
    private String model;

    @ExcelField(title = "单位", order = 1)
    private String company;

    @ExcelField(title = "款式", order = 1)
    private String style;

    @ExcelField(title = "品牌", order = 1)
    private String brand;

    @ExcelField(title = "长(MM)", order = 1)
    private String longc;

    @ExcelField(title = "宽(MM)", order = 1)
    private String widthc;

    @ExcelField(title = "高(MM)", order = 1)
    private String highc;

    @ExcelField(title = "体积(CBM)", order = 1)
    private String volume;

    @ExcelField(title = "采购价(RMB)", order = 1)
    private String purchasePrice;

    @ExcelField(title = "最高售价(USD)", order = 1)
    private String maximumSellingPrice;

    @ExcelField(title = "批发价格(USD)", order = 1)
    private String wholesalePrice;

    @ExcelField(title = "零售价格(USD)", order = 1)
    private String retailPrice;

    @ExcelField(title = "市场参考价（USD）", order = 1)
    private String marketReferencePrice;

    @ExcelField(title = "开发日期", order = 1)
    private String dateOfDevelopment;

    @ExcelField(title = "网页地址1", order = 1)
    private String webAddress;

    @ExcelField(title = "网页地址2", order = 1)
    private String webAddress2;

    @ExcelField(title = "网页地址3", order = 1)
    private String webAddress3;

    @ExcelField(title = "UPC码", order = 1)
    private String UPC;

    @ExcelField(title = "ESIN码", order = 1)
    private String ESIN;

    @ExcelField(title = "配件明细", order = 1)
    private String accessoriesDetails;

    @ExcelField(title = "产品认证", order = 1)
    private String productCertification;

    @ExcelField(title = "报关中文名", order = 1)
    private String chineseNameOfCustomsDeclaration;

    @ExcelField(title = "报关英文名", order = 1)
    private String englishNameOfCustomsDeclaration;

    @ExcelField(title = "重量（KG）", order = 1)
    private String weight;

    @ExcelField(title = "申报价值（USD)", order = 1)
    private String declaredValue;

    @ExcelField(title = "原产国", order = 1)
    private String countryOfOrigin;

    @ExcelField(title = "海关编码", order = 1)
    private String customsCode;

    @ExcelField(title = "清关编码", order = 1)
    private String customsClearanceCode;

    @ExcelField(title = "库存上限", order = 1)
    private String inventoryCeiling;

    @ExcelField(title = "库存下限", order = 1)
    private String lowerLimitOfInventory;

    @ExcelField(title = "滞销下限", order = 1)
    private String unsalableMinimum;

    @ExcelField(title = "预警销售周期(天)", order = 1)
    private String earlyWarningSalesCycle;

    @ExcelField(title = "样品数量", order = 1)
    private String sampleQuantity;

    @ExcelField(title = "开发员", order = 1)
    private String developer;

    @ExcelField(title = "业绩归属人1", order = 1)
    private String performanceAttributor1;

    @ExcelField(title = "业绩归属人2", order = 1)
    private String performanceAttributor2;

    @ExcelField(title = "内包装成本(RMB)", order = 1)
    private String internalPackingCost;

    @ExcelField(title = "包装规格名称", order = 1)
    private String nameOfPackingSpecification;

    @ExcelField(title = "最小包装数量", order = 1)
    private String minimumPackingQuantity;

    @ExcelField(title = "供应商名称", order = 1)
    private String nameOfSupplier;

    @ExcelField(title = "采购员", order = 1)
    private String buyer;

    @ExcelField(title = "采购渠道", order = 1)
    private String procurementChannel;

    @ExcelField(title = "交期", order = 1)
    private String deliveryTime;

    @ExcelField(title = "最小订货量", order = 1)
    private String minimumOrderQuantity;

    @ExcelField(title = "英文标题1", order = 1)
    private String englishTitle1;

    @ExcelField(title = "英文标题2", order = 1)
    private String englishTitle2;

    @ExcelField(title = "英文标题3", order = 1)
    private String englishTitle3;

    @ExcelField(title = "美国标题1", order = 1)
    private String americanTitle1;

    @ExcelField(title = "美国标题2", order = 1)
    private String americanTitle2;

    @ExcelField(title = "美国标题3", order = 1)
    private String americanTitle3;

    @ExcelField(title = "澳洲标题1", order = 1)
    private String australiaTitle1;

    @ExcelField(title = "澳洲标题2", order = 1)
    private String australiaTitle2;

    @ExcelField(title = "澳洲标题3", order = 1)
    private String australiaTitle3;

    @ExcelField(title = "法语标题1", order = 1)
    private String frenchTitle1;

    @ExcelField(title = "法语标题2", order = 1)
    private String frenchTitle2;

    @ExcelField(title = "法语标题3", order = 1)
    private String frenchTitle3;

    @ExcelField(title = "西班牙语标题1", order = 1)
    private String spanishTitle1;

    @ExcelField(title = "西班牙语标题2", order = 1)
    private String spanishTitle2;

    @ExcelField(title = "西班牙语标题3", order = 1)
    private String spanishTitle3;

    @ExcelField(title = "意大利语标题1", order = 1)
    private String italianTitle1;

    @ExcelField(title = "意大利语标题2", order = 1)
    private String italianTitle2;

    @ExcelField(title = "意大利语标题3", order = 1)
    private String italianTitle3;

    @ExcelField(title = "德语标题1", order = 1)
    private String germanTitle1;

    @ExcelField(title = "德语标题2", order = 1)
    private String germanTitle2;

    @ExcelField(title = "德语标题3", order = 1)
    private String germanTitle3;

    @ExcelField(title = "日语标题1", order = 1)
    private String japaneseTitle1;

    @ExcelField(title = "日语标题2", order = 1)
    private String japaneseTitle2;

    @ExcelField(title = "日语标题3", order = 1)
    private String japaneseTitle3;

    @ExcelField(title = "英国类别1", order = 1)
    private String britishCategory1;

    @ExcelField(title = "英国类别2", order = 1)
    private String britishCategory2;

    @ExcelField(title = "英国类别3", order = 1)
    private String britishCategory3;

    @ExcelField(title = "美国类别1", order = 1)
    private String americanCategory1;

    @ExcelField(title = "美国类别2", order = 1)
    private String americanCategory2;

    @ExcelField(title = "美国类别3", order = 1)
    private String americanCategory3;

    @ExcelField(title = "法国类别1", order = 1)
    private String franceCategory1;

    @ExcelField(title = "法国类别2", order = 1)
    private String franceCategory2;

    @ExcelField(title = "法国类别3", order = 1)
    private String franceCategory3;

    @ExcelField(title = "西班牙类别1", order = 1)
    private String spanishCategory1;

    @ExcelField(title = "西班牙类别2", order = 1)
    private String spanishCategory2;

    @ExcelField(title = "西班牙类别3", order = 1)
    private String spanishCategory3;

    @ExcelField(title = "日本类别1", order = 1)
    private String japaneseCategory1;

    @ExcelField(title = "日本类别2", order = 1)
    private String japaneseCategory2;

    @ExcelField(title = "日本类别3", order = 1)
    private String japaneseCategory3;

    @ExcelField(title = "意大利类别1", order = 1)
    private String italianCategory1;

    @ExcelField(title = "意大利类别2", order = 1)
    private String italianCategory2;

    @ExcelField(title = "意大利类别3", order = 1)
    private String italianCategory3;

    @ExcelField(title = "澳洲类别1", order = 1)
    private String australianCategory1;

    @ExcelField(title = "澳洲类别2", order = 1)
    private String australianCategory2;

    @ExcelField(title = "澳洲类别3", order = 1)
    private String australianCategory3;

    @ExcelField(title = "德国类别1", order = 1)
    private String germanCategory1;

    @ExcelField(title = "德国类别2", order = 1)
    private String germanCategory2;

    @ExcelField(title = "德国类别3", order = 1)
    private String germanCategory3;

    public String getWhetherToCombineCommoditiesOrNot() {
        return whetherToCombineCommoditiesOrNot;
    }

    public void setWhetherToCombineCommoditiesOrNot(String whetherToCombineCommoditiesOrNot) {
        this.whetherToCombineCommoditiesOrNot = whetherToCombineCommoditiesOrNot;
    }

    public String getCommodityCategory() {
        return commodityCategory;
    }

    public void setCommodityCategory(String commodityCategory) {
        this.commodityCategory = commodityCategory;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getTradeSKU() {
        return tradeSKU;
    }

    public void setTradeSKU(String tradeSKU) {
        this.tradeSKU = tradeSKU;
    }

    public String getCommodityStatus() {
        return commodityStatus;
    }

    public void setCommodityStatus(String commodityStatus) {
        this.commodityStatus = commodityStatus;
    }

    public String getCommodityDescription() {
        return commodityDescription;
    }

    public void setCommodityDescription(String commodityDescription) {
        this.commodityDescription = commodityDescription;
    }

    public String getCommodityGrade() {
        return commodityGrade;
    }

    public void setCommodityGrade(String commodityGrade) {
        this.commodityGrade = commodityGrade;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public String getMaterialScience() {
        return materialScience;
    }

    public void setMaterialScience(String materialScience) {
        this.materialScience = materialScience;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLongc() {
        return longc;
    }

    public void setLongc(String longc) {
        this.longc = longc;
    }

    public String getWidthc() {
        return widthc;
    }

    public void setWidthc(String widthc) {
        this.widthc = widthc;
    }

    public String getHighc() {
        return highc;
    }

    public void setHighc(String highc) {
        this.highc = highc;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getMaximumSellingPrice() {
        return maximumSellingPrice;
    }

    public void setMaximumSellingPrice(String maximumSellingPrice) {
        this.maximumSellingPrice = maximumSellingPrice;
    }

    public String getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(String wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public String getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(String retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getMarketReferencePrice() {
        return marketReferencePrice;
    }

    public void setMarketReferencePrice(String marketReferencePrice) {
        this.marketReferencePrice = marketReferencePrice;
    }

    public String getDateOfDevelopment() {
        return dateOfDevelopment;
    }

    public void setDateOfDevelopment(String dateOfDevelopment) {
        this.dateOfDevelopment = dateOfDevelopment;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getWebAddress2() {
        return webAddress2;
    }

    public void setWebAddress2(String webAddress2) {
        this.webAddress2 = webAddress2;
    }

    public String getWebAddress3() {
        return webAddress3;
    }

    public void setWebAddress3(String webAddress3) {
        this.webAddress3 = webAddress3;
    }

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public String getESIN() {
        return ESIN;
    }

    public void setESIN(String ESIN) {
        this.ESIN = ESIN;
    }

    public String getAccessoriesDetails() {
        return accessoriesDetails;
    }

    public void setAccessoriesDetails(String accessoriesDetails) {
        this.accessoriesDetails = accessoriesDetails;
    }

    public String getProductCertification() {
        return productCertification;
    }

    public void setProductCertification(String productCertification) {
        this.productCertification = productCertification;
    }

    public String getChineseNameOfCustomsDeclaration() {
        return chineseNameOfCustomsDeclaration;
    }

    public void setChineseNameOfCustomsDeclaration(String chineseNameOfCustomsDeclaration) {
        this.chineseNameOfCustomsDeclaration = chineseNameOfCustomsDeclaration;
    }

    public String getEnglishNameOfCustomsDeclaration() {
        return englishNameOfCustomsDeclaration;
    }

    public void setEnglishNameOfCustomsDeclaration(String englishNameOfCustomsDeclaration) {
        this.englishNameOfCustomsDeclaration = englishNameOfCustomsDeclaration;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDeclaredValue() {
        return declaredValue;
    }

    public void setDeclaredValue(String declaredValue) {
        this.declaredValue = declaredValue;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCustomsCode() {
        return customsCode;
    }

    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    public String getCustomsClearanceCode() {
        return customsClearanceCode;
    }

    public void setCustomsClearanceCode(String customsClearanceCode) {
        this.customsClearanceCode = customsClearanceCode;
    }

    public String getInventoryCeiling() {
        return inventoryCeiling;
    }

    public void setInventoryCeiling(String inventoryCeiling) {
        this.inventoryCeiling = inventoryCeiling;
    }

    public String getLowerLimitOfInventory() {
        return lowerLimitOfInventory;
    }

    public void setLowerLimitOfInventory(String lowerLimitOfInventory) {
        this.lowerLimitOfInventory = lowerLimitOfInventory;
    }

    public String getUnsalableMinimum() {
        return unsalableMinimum;
    }

    public void setUnsalableMinimum(String unsalableMinimum) {
        this.unsalableMinimum = unsalableMinimum;
    }

    public String getEarlyWarningSalesCycle() {
        return earlyWarningSalesCycle;
    }

    public void setEarlyWarningSalesCycle(String earlyWarningSalesCycle) {
        this.earlyWarningSalesCycle = earlyWarningSalesCycle;
    }

    public String getSampleQuantity() {
        return sampleQuantity;
    }

    public void setSampleQuantity(String sampleQuantity) {
        this.sampleQuantity = sampleQuantity;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPerformanceAttributor1() {
        return performanceAttributor1;
    }

    public void setPerformanceAttributor1(String performanceAttributor1) {
        this.performanceAttributor1 = performanceAttributor1;
    }

    public String getPerformanceAttributor2() {
        return performanceAttributor2;
    }

    public void setPerformanceAttributor2(String performanceAttributor2) {
        this.performanceAttributor2 = performanceAttributor2;
    }

    public String getInternalPackingCost() {
        return internalPackingCost;
    }

    public void setInternalPackingCost(String internalPackingCost) {
        this.internalPackingCost = internalPackingCost;
    }

    public String getNameOfPackingSpecification() {
        return nameOfPackingSpecification;
    }

    public void setNameOfPackingSpecification(String nameOfPackingSpecification) {
        this.nameOfPackingSpecification = nameOfPackingSpecification;
    }

    public String getMinimumPackingQuantity() {
        return minimumPackingQuantity;
    }

    public void setMinimumPackingQuantity(String minimumPackingQuantity) {
        this.minimumPackingQuantity = minimumPackingQuantity;
    }

    public String getNameOfSupplier() {
        return nameOfSupplier;
    }

    public void setNameOfSupplier(String nameOfSupplier) {
        this.nameOfSupplier = nameOfSupplier;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getProcurementChannel() {
        return procurementChannel;
    }

    public void setProcurementChannel(String procurementChannel) {
        this.procurementChannel = procurementChannel;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    public void setMinimumOrderQuantity(String minimumOrderQuantity) {
        this.minimumOrderQuantity = minimumOrderQuantity;
    }

    public String getEnglishTitle1() {
        return englishTitle1;
    }

    public void setEnglishTitle1(String englishTitle1) {
        this.englishTitle1 = englishTitle1;
    }

    public String getEnglishTitle2() {
        return englishTitle2;
    }

    public void setEnglishTitle2(String englishTitle2) {
        this.englishTitle2 = englishTitle2;
    }

    public String getEnglishTitle3() {
        return englishTitle3;
    }

    public void setEnglishTitle3(String englishTitle3) {
        this.englishTitle3 = englishTitle3;
    }

    public String getAmericanTitle1() {
        return americanTitle1;
    }

    public void setAmericanTitle1(String americanTitle1) {
        this.americanTitle1 = americanTitle1;
    }

    public String getAmericanTitle2() {
        return americanTitle2;
    }

    public void setAmericanTitle2(String americanTitle2) {
        this.americanTitle2 = americanTitle2;
    }

    public String getAmericanTitle3() {
        return americanTitle3;
    }

    public void setAmericanTitle3(String americanTitle3) {
        this.americanTitle3 = americanTitle3;
    }

    public String getAustraliaTitle1() {
        return australiaTitle1;
    }

    public void setAustraliaTitle1(String australiaTitle1) {
        this.australiaTitle1 = australiaTitle1;
    }

    public String getAustraliaTitle2() {
        return australiaTitle2;
    }

    public void setAustraliaTitle2(String australiaTitle2) {
        this.australiaTitle2 = australiaTitle2;
    }

    public String getAustraliaTitle3() {
        return australiaTitle3;
    }

    public void setAustraliaTitle3(String australiaTitle3) {
        this.australiaTitle3 = australiaTitle3;
    }

    public String getFrenchTitle1() {
        return frenchTitle1;
    }

    public void setFrenchTitle1(String frenchTitle1) {
        this.frenchTitle1 = frenchTitle1;
    }

    public String getFrenchTitle2() {
        return frenchTitle2;
    }

    public void setFrenchTitle2(String frenchTitle2) {
        this.frenchTitle2 = frenchTitle2;
    }

    public String getFrenchTitle3() {
        return frenchTitle3;
    }

    public void setFrenchTitle3(String frenchTitle3) {
        this.frenchTitle3 = frenchTitle3;
    }

    public String getSpanishTitle1() {
        return spanishTitle1;
    }

    public void setSpanishTitle1(String spanishTitle1) {
        this.spanishTitle1 = spanishTitle1;
    }

    public String getSpanishTitle2() {
        return spanishTitle2;
    }

    public void setSpanishTitle2(String spanishTitle2) {
        this.spanishTitle2 = spanishTitle2;
    }

    public String getSpanishTitle3() {
        return spanishTitle3;
    }

    public void setSpanishTitle3(String spanishTitle3) {
        this.spanishTitle3 = spanishTitle3;
    }

    public String getItalianTitle1() {
        return italianTitle1;
    }

    public void setItalianTitle1(String italianTitle1) {
        this.italianTitle1 = italianTitle1;
    }

    public String getItalianTitle2() {
        return italianTitle2;
    }

    public void setItalianTitle2(String italianTitle2) {
        this.italianTitle2 = italianTitle2;
    }

    public String getItalianTitle3() {
        return italianTitle3;
    }

    public void setItalianTitle3(String italianTitle3) {
        this.italianTitle3 = italianTitle3;
    }

    public String getGermanTitle1() {
        return germanTitle1;
    }

    public void setGermanTitle1(String germanTitle1) {
        this.germanTitle1 = germanTitle1;
    }

    public String getGermanTitle2() {
        return germanTitle2;
    }

    public void setGermanTitle2(String germanTitle2) {
        this.germanTitle2 = germanTitle2;
    }

    public String getGermanTitle3() {
        return germanTitle3;
    }

    public void setGermanTitle3(String germanTitle3) {
        this.germanTitle3 = germanTitle3;
    }

    public String getJapaneseTitle1() {
        return japaneseTitle1;
    }

    public void setJapaneseTitle1(String japaneseTitle1) {
        this.japaneseTitle1 = japaneseTitle1;
    }

    public String getJapaneseTitle2() {
        return japaneseTitle2;
    }

    public void setJapaneseTitle2(String japaneseTitle2) {
        this.japaneseTitle2 = japaneseTitle2;
    }

    public String getJapaneseTitle3() {
        return japaneseTitle3;
    }

    public void setJapaneseTitle3(String japaneseTitle3) {
        this.japaneseTitle3 = japaneseTitle3;
    }

    public String getBritishCategory1() {
        return britishCategory1;
    }

    public void setBritishCategory1(String britishCategory1) {
        this.britishCategory1 = britishCategory1;
    }

    public String getBritishCategory2() {
        return britishCategory2;
    }

    public void setBritishCategory2(String britishCategory2) {
        this.britishCategory2 = britishCategory2;
    }

    public String getBritishCategory3() {
        return britishCategory3;
    }

    public void setBritishCategory3(String britishCategory3) {
        this.britishCategory3 = britishCategory3;
    }

    public String getAmericanCategory1() {
        return americanCategory1;
    }

    public void setAmericanCategory1(String americanCategory1) {
        this.americanCategory1 = americanCategory1;
    }

    public String getAmericanCategory2() {
        return americanCategory2;
    }

    public void setAmericanCategory2(String americanCategory2) {
        this.americanCategory2 = americanCategory2;
    }

    public String getAmericanCategory3() {
        return americanCategory3;
    }

    public void setAmericanCategory3(String americanCategory3) {
        this.americanCategory3 = americanCategory3;
    }

    public String getFranceCategory1() {
        return franceCategory1;
    }

    public void setFranceCategory1(String franceCategory1) {
        this.franceCategory1 = franceCategory1;
    }

    public String getFranceCategory2() {
        return franceCategory2;
    }

    public void setFranceCategory2(String franceCategory2) {
        this.franceCategory2 = franceCategory2;
    }

    public String getFranceCategory3() {
        return franceCategory3;
    }

    public void setFranceCategory3(String franceCategory3) {
        this.franceCategory3 = franceCategory3;
    }

    public String getSpanishCategory1() {
        return spanishCategory1;
    }

    public void setSpanishCategory1(String spanishCategory1) {
        this.spanishCategory1 = spanishCategory1;
    }

    public String getSpanishCategory2() {
        return spanishCategory2;
    }

    public void setSpanishCategory2(String spanishCategory2) {
        this.spanishCategory2 = spanishCategory2;
    }

    public String getSpanishCategory3() {
        return spanishCategory3;
    }

    public void setSpanishCategory3(String spanishCategory3) {
        this.spanishCategory3 = spanishCategory3;
    }

    public String getJapaneseCategory1() {
        return japaneseCategory1;
    }

    public void setJapaneseCategory1(String japaneseCategory1) {
        this.japaneseCategory1 = japaneseCategory1;
    }

    public String getJapaneseCategory2() {
        return japaneseCategory2;
    }

    public void setJapaneseCategory2(String japaneseCategory2) {
        this.japaneseCategory2 = japaneseCategory2;
    }

    public String getJapaneseCategory3() {
        return japaneseCategory3;
    }

    public void setJapaneseCategory3(String japaneseCategory3) {
        this.japaneseCategory3 = japaneseCategory3;
    }

    public String getItalianCategory1() {
        return italianCategory1;
    }

    public void setItalianCategory1(String italianCategory1) {
        this.italianCategory1 = italianCategory1;
    }

    public String getItalianCategory2() {
        return italianCategory2;
    }

    public void setItalianCategory2(String italianCategory2) {
        this.italianCategory2 = italianCategory2;
    }

    public String getItalianCategory3() {
        return italianCategory3;
    }

    public void setItalianCategory3(String italianCategory3) {
        this.italianCategory3 = italianCategory3;
    }

    public String getAustralianCategory1() {
        return australianCategory1;
    }

    public void setAustralianCategory1(String australianCategory1) {
        this.australianCategory1 = australianCategory1;
    }

    public String getAustralianCategory2() {
        return australianCategory2;
    }

    public void setAustralianCategory2(String australianCategory2) {
        this.australianCategory2 = australianCategory2;
    }

    public String getAustralianCategory3() {
        return australianCategory3;
    }

    public void setAustralianCategory3(String australianCategory3) {
        this.australianCategory3 = australianCategory3;
    }

    public String getGermanCategory1() {
        return germanCategory1;
    }

    public void setGermanCategory1(String germanCategory1) {
        this.germanCategory1 = germanCategory1;
    }

    public String getGermanCategory2() {
        return germanCategory2;
    }

    public void setGermanCategory2(String germanCategory2) {
        this.germanCategory2 = germanCategory2;
    }

    public String getGermanCategory3() {
        return germanCategory3;
    }

    public void setGermanCategory3(String germanCategory3) {
        this.germanCategory3 = germanCategory3;
    }
}
