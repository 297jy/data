package com.chen.data.analysis.common.constant;

public enum SqlAggregationTypeEnum {

    SUM("sum"), MIN("min"), MAX("max");

    private final String value;

    SqlAggregationTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
