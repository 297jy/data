package com.chen.data.analysis.admin.dto;

import com.chen.data.analysis.common.constant.TaskStateEnum;
import lombok.Data;

@Data
public class QueryTaskPlanDTO {

    private Integer id;

    private QueryTaskPlanDTO prevPlanId;

    private QueryTaskPlanDTO nextPlanId;

    private QueryTaskDTO task;

    private Integer retryCnt;

    private TaskStateEnum state;

    private String sqlMapJsonValue;

    private String dataSetTempTableName;

}
