package com.chen.data.analysis.admin.dto;

import com.chen.data.analysis.common.constant.DataTypeEnum;
import com.chen.data.analysis.common.constant.OperatorEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

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

    private String dataFormat;

}
