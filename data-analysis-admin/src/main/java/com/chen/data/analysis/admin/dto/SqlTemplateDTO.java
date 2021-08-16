package com.chen.data.analysis.admin.dto;

import com.chen.data.analysis.common.constant.QueryEngineTypeEnum;
import lombok.Data;

import java.util.List;

/**
 * SQL模板实体
 */
@Data
public class SqlTemplateDTO {

    private Integer id;

    private List<String> cols;

    private String label;

    private String describe;

    private String sql;

    private QueryEngineTypeEnum queryEngineType;

}
