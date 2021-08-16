package com.chen.data.analysis.admin.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DataSetDTO extends AbstractSqlComponentDTO {

    private List<VariableDTO> variables;

}
