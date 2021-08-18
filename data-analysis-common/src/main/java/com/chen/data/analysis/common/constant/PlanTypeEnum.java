package com.chen.data.analysis.common.constant;

public enum PlanTypeEnum {

    CREATE_TABLE("CREATE_TABLE"),
    QUERY("QUERY"),
    DROP_TEMP_TABLE("DROP_TEMP_TABLE"),
    DROP_TEMP_FILE("DROP_TEMP_FILE"),
    IMPORT_FILE_DATA("IMPORT_FILE_DATA");

    private final String value;

    PlanTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
