package com.chen.data.analysis.admin.bo.plan;

import com.chen.data.analysis.admin.dto.QueryTaskDTO;
import com.chen.data.analysis.admin.dto.QueryTaskPlanDTO;


public interface QueryTaskPlanCreator {

    QueryTaskPlanDTO createQueryTaskPlan(QueryTaskDTO taskDTO);

}
