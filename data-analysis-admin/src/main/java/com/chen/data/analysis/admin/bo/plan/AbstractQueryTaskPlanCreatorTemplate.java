package com.chen.data.analysis.admin.bo.plan;

import com.chen.data.analysis.admin.bo.plan.constant.TableConstant;
import com.chen.data.analysis.admin.dto.QueryTaskDTO;
import com.chen.data.analysis.admin.dto.QueryTaskPlanDTO;
import com.chen.data.analysis.admin.dto.VariableDTO;
import com.chen.data.analysis.common.constant.TaskStateEnum;
import com.chen.data.analysis.common.constant.WidgetTypeEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractQueryTaskPlanCreatorTemplate implements QueryTaskPlanCreator {

    protected abstract String getTempDataBase();

    @Override
    public QueryTaskPlanDTO createQueryTaskPlan(QueryTaskDTO taskDTO) {
        return null;
    }

    private QueryTaskPlanDTO createImportTmpFileDataPlan(QueryTaskDTO taskDTO, long timeStamp) {

        List<QueryTaskPlanDTO> plans = new ArrayList<>();
        List<VariableDTO> tempVariables = taskDTO.getVariables().stream()
                .filter(v -> v.getWidgetType().equals(WidgetTypeEnum.OBJ_FILE_PATH_TEXT)).collect(Collectors.toList());

        for (VariableDTO variable : tempVariables) {
            String tempTableName = String.format("%s.%s_%s_%s", getTempDataBase(),
                    TableConstant.Operator.CREATE_TEMP_TABLE, taskDTO.getSubmitter(), ++timeStamp);
            QueryTaskPlanDTO plan = new QueryTaskPlanDTO();
            plan.setTask(taskDTO);
            plan.setRetryCnt(0);
            plan.setState(TaskStateEnum.PENDING);
            plan.setSql(getCreateTempTableSql(tempTableName));
            plan.setOperatorTempFileDataPath(variable.getValue());
            plans.add(plan);
        }

        //将计划数组转换成计划链表
        for (int i = 0; i < plans.size(); i++) {
            if ((i + 1) < plans.size()) {
                plans.get(i).setNextPlan(plans.get(i + 1));
            }
            if (i > 0) {
                plans.get(i).setPrevPlan(plans.get(i - 1));
            }
        }
        return plans.isEmpty() ? null : plans.get(0);
    }

    /**
     * 获取创建临时表的SQL
     *
     * @param tempTableName 临时表名
     * @return
     */
    protected abstract String getCreateTempTableSql(String tempTableName);


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
