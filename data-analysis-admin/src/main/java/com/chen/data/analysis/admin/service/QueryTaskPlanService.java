package com.chen.data.analysis.admin.service;

import com.chen.data.analysis.admin.dto.QueryTaskDTO;
import com.chen.data.analysis.admin.dto.QueryTaskPlanDTO;

public interface QueryTaskPlanService {

    QueryTaskPlanDTO buildTaskPlan(QueryTaskDTO taskDTO);

    boolean save(QueryTaskPlanDTO planDTO);

    boolean executePlanById(Integer planId);

    boolean cancelPlanById(Integer taskId);

    boolean retryExecutePlan(Integer planId);

}
