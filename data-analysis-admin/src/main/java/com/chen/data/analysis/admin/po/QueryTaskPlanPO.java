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

    //这个计划执行需要的临时表,多个表用逗号分隔
    private String operatorTempTables;
    //这个计划需要执行的sql语句
    private String sql;
    //结果文件存放的地址
    private String resFilePath;

}
