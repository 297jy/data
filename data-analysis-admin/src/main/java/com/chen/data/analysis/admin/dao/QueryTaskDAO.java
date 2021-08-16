package com.chen.data.analysis.admin.dao;

import com.chen.data.analysis.admin.po.QueryTaskPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QueryTaskDAO {

    List<QueryTaskPO> listAll();

    List<QueryTaskPO> listRecentSubmitTaskOfUser(String username);

    QueryTaskPO getTaskById(Integer id);

    int save(QueryTaskPO taskPO);

    int update(QueryTaskPO taskPO);

}
