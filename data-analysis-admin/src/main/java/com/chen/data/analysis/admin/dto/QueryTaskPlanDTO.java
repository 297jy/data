package com.chen.data.analysis.admin.dto;

import com.chen.data.analysis.common.constant.PlanTypeEnum;
import com.chen.data.analysis.common.constant.TaskStateEnum;
import lombok.Data;

@Data
public class QueryTaskPlanDTO {

    private Integer id;

    private QueryTaskPlanDTO prevPlan;

    private QueryTaskPlanDTO nextPlan;

    private QueryTaskDTO task;

    private Integer retryCnt;

    private TaskStateEnum state;

    private PlanTypeEnum planType;

    private String sql;

    private String operatorTempTable;
    //临时文件数据的路径,用于创建临时表
    private String operatorTempFileDataPath;

    private String resFilePath;

}
