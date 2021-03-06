package com.chen.data.analysis.admin.dto;

import com.chen.data.analysis.common.constant.DataTypeEnum;
import com.chen.data.analysis.common.constant.OperatorEnum;
import com.chen.data.analysis.common.constant.SqlAggregationTypeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class QuotaDTO extends AbstractSqlComponentDTO {

    private QuotaDTO leftOperatorQuota;

    private QuotaDTO rightOperatorQuota;

    private String headerFormat;

    private String abscissaCol;

    private OperatorEnum operator;

    private DataTypeEnum dataType;

    private DataTypeEnum abscissaDataType;

    private SqlAggregationTypeEnum aggregationType;

    private String dataFormat;

    private List<VariableDTO> variables;

}
