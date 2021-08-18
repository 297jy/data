package com.chen.data.analysis.admin.bo.plan;

import com.chen.data.analysis.admin.bo.plan.constant.TableConstant;
import com.chen.data.analysis.admin.dto.QueryTaskDTO;
import com.chen.data.analysis.admin.dto.QueryTaskPlanDTO;
import com.chen.data.analysis.admin.dto.VariableDTO;
import com.chen.data.analysis.common.constant.PlanTypeEnum;
import com.chen.data.analysis.common.constant.TaskStateEnum;
import com.chen.data.analysis.common.constant.WidgetTypeEnum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class AbstractQueryTaskPlanCreatorTemplate implements QueryTaskPlanCreator {

    @Override
    public QueryTaskPlanDTO createQueryTaskPlan(QueryTaskDTO taskDTO) {
        return null;
    }

    /**
     * 获取创建临时表的SQL
     *
     * @param tempTableName 临时表名
     * @return
     */
    protected abstract String getCreateTempTableSql(String tempTableName);

    protected abstract String getCreateDataSetSql(String dataSetTableName);

    protected abstract String getQueryQuotaDataSql(String dataSetTableName);

    protected abstract String getDropTempTableSql(String tempTableName);

    protected abstract String getTempDataBase();

    protected abstract String getTempResFileDirectory();


    private List<QueryTaskPlanDTO> createImportTmpFileDataPlan(QueryTaskDTO taskDTO, long timeStamp) {

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
            plan.setOperatorTempFileDataPath(tempTableName);
            plans.add(plan);
        }

        return plans;
    }


    /**
     * 创建 数据集 计划
     *
     * @param taskDTO
     * @param dataSetTableName
     * @return
     */
    private QueryTaskPlanDTO createDataSetPlan(QueryTaskDTO taskDTO, String dataSetTableName) {
        if (taskDTO.getReportForm().getDataSets().isEmpty()) {
            return null;
        }

        QueryTaskPlanDTO plan = new QueryTaskPlanDTO();
        plan.setTask(taskDTO);
        plan.setRetryCnt(0);
        plan.setState(TaskStateEnum.PENDING);
        plan.setSql(getCreateDataSetSql(dataSetTableName));
        plan.setOperatorTempTable(dataSetTableName);
        return plan;
    }

    /**
     * 创建查询 指标数据 的计划
     *
     * @param taskDTO
     * @return
     */
    private List<QueryTaskPlanDTO> createQueryQuotaDataPlan(QueryTaskDTO taskDTO, String dataSetTableName) {

        List<QueryTaskPlanDTO> plans = new ArrayList<>();
        taskDTO.getReportForm().getQuotas().forEach(quotaDTO -> {
            QueryTaskPlanDTO plan = new QueryTaskPlanDTO();
            plan.setPlanType(PlanTypeEnum.QUERY);
            plan.setTask(taskDTO);
            plan.setRetryCnt(0);
            plan.setState(TaskStateEnum.PENDING);
            plan.setSql(getQueryQuotaDataSql(dataSetTableName));
            plan
        });
        return plans;
    }

    private List<QueryTaskPlanDTO> createDropTempTablePlan(QueryTaskDTO taskDTO, List<QueryTaskPlanDTO> plans) {
        List<QueryTaskPlanDTO> dropTempTablePlans = new ArrayList<>();
        Set<String> tempTableNames = new HashSet<>();
        plans.forEach(v -> tempTableNames.add(v.getOperatorTempTable()));
        tempTableNames.forEach(name -> {
            QueryTaskPlanDTO plan = new QueryTaskPlanDTO();
            plan.setPlanType(PlanTypeEnum.DROP_TEMP_TABLE);
            plan.setTask(taskDTO);
            plan.setRetryCnt(0);
            plan.setState(TaskStateEnum.PENDING);
            plan.setSql(getDropTempTableSql(getDropTempTableSql(name)));
            dropTempTablePlans.add(plan);
        });
        return dropTempTablePlans;
    }

    private List<QueryTaskPlanDTO> createDropTempFilePlan(QueryTaskDTO taskDTO, List<QueryTaskPlanDTO> plans) {
        List<QueryTaskPlanDTO> dropTempFilePlans = new ArrayList<>();
        Set<String> tempTableNames = new HashSet<>();
        plans.forEach(v -> tempTableNames.add(v.getResFilePath()));
        tempTableNames.forEach(name -> {
            QueryTaskPlanDTO plan = new QueryTaskPlanDTO();
            plan.setPlanType(PlanTypeEnum.DROP_TEMP_FILE);
            plan.setTask(taskDTO);
            plan.setRetryCnt(0);
            plan.setState(TaskStateEnum.PENDING);
            plan.setOperatorTempFileDataPath(name);
            dropTempFilePlans.add(plan);
        });
        return dropTempFilePlans;
    }

}
