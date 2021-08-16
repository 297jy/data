package com.chen.data.analysis.common.constant;

public enum TaskStateEnum {

    RUNNING("running"),
    PENDING("pending"),
    SUCCESS("success"),
    FAIL("fail"),
    QUERY("query"),
    CREATE_TABLE("create_table"),
    CANCEL("cancel");

    private final String value;

    TaskStateEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
