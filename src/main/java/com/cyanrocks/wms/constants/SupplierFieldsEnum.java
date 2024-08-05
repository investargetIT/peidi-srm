package com.cyanrocks.wms.constants;

public enum SupplierFieldsEnum {

    suppliesCategory("物资类目", "supplies_category"),
    brand("品类", "brand"),
    cooperationMode("合作模式", "cooperation_mode"),
    salesScope("销售范围（酒店）", "sales_scope"),
    progress("跟进进度", "progress");

    public String getFieldsCn() {
        return fieldsCn;
    }

    public String getFieldsEn() {
        return fieldsEn;
    }

    private final String fieldsCn;

    private final String fieldsEn;

    SupplierFieldsEnum(String fieldsCn, String fieldsEn) {
        this.fieldsCn = fieldsCn;
        this.fieldsEn = fieldsEn;
    }
}
