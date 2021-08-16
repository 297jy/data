package com.chen.data.analysis.admin.dao;

import com.chen.data.analysis.admin.po.QueryTaskPlanPO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QueryTaskPlanDAO {

    QueryTaskPlanPO getPlanById(Integer id);

    int save(QueryTaskPlanPO planPO);

    int update(QueryTaskPlanPO planPO);

}
