package com.chen.data.analysis.admin.dto;

import com.chen.data.analysis.common.constant.DataTypeEnum;
import com.chen.data.analysis.common.constant.WidgetTypeEnum;
import lombok.Data;

@Data
public class VariableDTO {

    private Integer id;

    private boolean requiredFlag;

    private String label;

    private String name;

    private String describe;

    private String value;

    private String defaultValue;

    private DataTypeEnum dataType;

    private WidgetTypeEnum widgetType;

}
