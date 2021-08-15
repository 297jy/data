package com.chen.data.analysis.admin.po;

import lombok.Data;

/**
 * SQL组件 抽象基类
 */

@Data
abstract class AbstractSqlComponentPO {

    private Integer id;

    private String label;

    private String describeTemplate;

    private Integer sqlTemplateId;

    private String cols;

}
