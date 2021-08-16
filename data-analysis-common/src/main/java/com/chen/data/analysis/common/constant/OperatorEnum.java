package com.chen.data.analysis.common.constant;


public enum OperatorEnum {

    ADD("+"), SUBTRACT("/"), MULTIPLY("*"), DIVIDE("/");

    private final String value;

    OperatorEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
