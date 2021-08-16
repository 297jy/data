package com.chen.data.analysis.common.constant;

public enum WidgetTypeEnum {

    LIST_TEXT("LIST_TEXT"), OBJ_FILE_PATH_TEXT("OBJ_FILE_PATH_TEXT"), CASE_WHEN_TEXT("CASE_WHEN_TEXT");

    private final String value;

    WidgetTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
