package com.chen.data.analysis.admin.dto;

import com.chen.data.analysis.common.constant.DataTypeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 数据集
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GroupDTO extends AbstractSqlComponentDTO {

    private DataTypeEnum dataType;

    private List<VariableDTO> variables;

}
