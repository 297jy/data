package com.chen.data.analysis.common.constant;

public enum DataTypeEnum {

    INTEGER("int"), DOUBLE("double"), STRING("string");

    private final String value;

    DataTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
