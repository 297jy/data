package com.chen.data.analysis.admin.bo.plan;

import com.chen.data.analysis.admin.dto.QueryTaskDTO;
import com.chen.data.analysis.admin.dto.QueryTaskPlanDTO;

public abstract class AbstractQueryTaskPlanCreatorTemplate implements QueryTaskPlanCreator{

    @Override
    public QueryTaskPlanDTO createQueryTaskPlan(QueryTaskDTO taskDTO) {
        return null;
    }

    private QueryTaskPlanDTO createImportTmpFileDataPlan(QueryTaskDTO taskDTO) {
        return null;
    }

    private QueryTaskPlanDTO createDataSetPlan(QueryTaskDTO taskDTO) {
        return null;
    }

    private QueryTaskDTO createQueryDataPlan(QueryTaskDTO taskDTO) {
        return null;
    }

    private QueryTaskPlanDTO createDropTempTablePlan(QueryTaskDTO taskDTO) {
        return null;
    }

}
