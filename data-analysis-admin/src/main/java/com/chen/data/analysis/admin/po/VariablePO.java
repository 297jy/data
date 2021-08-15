package com.chen.data.analysis.admin.po;

import lombok.Data;

@Data
public class VariablePO {

    private Integer id;

    private String label;

    private String name;

    private String describe;

    private String dataType;

    private String widgetType;

    private Integer requiredFlag;

    private String defaultValue;

}
