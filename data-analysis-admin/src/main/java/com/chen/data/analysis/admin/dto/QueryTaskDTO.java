package com.chen.data.analysis.admin.dto;

import com.chen.data.analysis.common.constant.TaskStateEnum;
import lombok.Data;

import java.util.List;

@Data
public class QueryTaskDTO {

    private Integer id;

    private ReportFormDTO reportForm;

    private String requestParamJsonValue;

    private String foreEndOriginalParam;

    private String submitter;

    private String submissionTime;

    private TaskStateEnum state;
    //任务进度
    private Integer progress;

    private List<VariableDTO> variables;

}
