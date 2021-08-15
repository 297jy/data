package com.chen.data.analysis.admin.po;

import lombok.Data;

/**
 * SQL模板实体
 */
@Data
public class SqlTemplatePO {

    private Integer id;

    private String cols;

    private String label;

    private String describe;

    private String sql;

    private String queryEngineType;

}
