package com.chen.data.analysis.admin.po;

import lombok.Data;

@Data
public class QueryTaskPO {

    private Integer id;

    private Integer reportFormId;

    private String requestParamJsonValue;

    private String foreEndOriginalParam;

    private String submitter;

    private String submissionTime;

    private String state;

}
