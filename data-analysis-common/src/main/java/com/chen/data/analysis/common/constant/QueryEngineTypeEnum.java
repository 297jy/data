package com.chen.data.analysis.common.constant;

public enum QueryEngineTypeEnum {

    IMPALA("impala");

    private final String value;

    QueryEngineTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
