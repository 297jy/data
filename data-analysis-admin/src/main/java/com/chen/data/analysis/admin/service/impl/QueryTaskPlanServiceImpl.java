package com.chen.data.analysis.admin.service.impl;

import com.chen.data.analysis.admin.dto.QueryTaskDTO;
import com.chen.data.analysis.admin.dto.QueryTaskPlanDTO;
import com.chen.data.analysis.admin.service.QueryTaskPlanService;

public class QueryTaskPlanServiceImpl implements QueryTaskPlanService {


    @Override
    public QueryTaskPlanDTO buildTaskPlan(QueryTaskDTO taskDTO) {
        return null;
    }

    @Override
    public boolean save(QueryTaskPlanDTO planDTO) {
        return false;
    }

    @Override
    public boolean executePlanById(Integer planId) {
        return false;
    }

    @Override
    public boolean cancelPlanById(Integer taskId) {
        return false;
    }

    @Override
    public boolean retryExecutePlan(Integer planId) {
        return false;
    }

}
