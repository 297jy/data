package com.chen.data.analysis.admin.dto;

import lombok.Data;

import java.util.List;

/**
 * SQL组件 抽象基类
 */

@Data
abstract class AbstractSqlComponentDTO {

    private Integer id;

    private String label;

    private String describeTemplate;

    private SqlTemplateDTO sqlTemplate;

    private List<String> cols;

}
