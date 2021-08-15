package com.chen.data.analysis.admin.po;

import lombok.Data;

@Data
public class QueryTaskPlanPO {

    private Integer id;

    private Integer prevPlanId;

    private Integer nextPlanId;

    private Integer taskId;

    private Integer retryCnt;

    private String state;

    private String sqlMapJsonValue;

    private String dataSetTempTableName;

}
