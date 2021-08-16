package com.chen.data.analysis.admin.po;

import lombok.Data;

/**
 * SQL模板实体
 */
@Data
public class SqlTemplatePO {

    private Integer id;
    //该SQL模板会输出的列
    private String cols;

    private String label;

    private String describe;

    private String sql;
    //查询引擎
    private String queryEngineType;

}
