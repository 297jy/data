package com.chen.data.analysis.admin.po;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数据集
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GroupPO extends AbstractSqlComponentPO {

    private String dataType;

}
