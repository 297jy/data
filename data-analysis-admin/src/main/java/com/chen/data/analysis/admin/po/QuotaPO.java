package com.chen.data.analysis.admin.po;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class QuotaPO extends AbstractSqlComponentPO {

    private Integer leftOperatorQuotaId;

    private Integer rightOperatorQuotaId;

    private String headerFormat;

    private String abscissaCol;

    private String operator;

    private String dataType;

    private String abscissaDataType;

    private String sqlAggregationType;

    private String dataFormat;

}
