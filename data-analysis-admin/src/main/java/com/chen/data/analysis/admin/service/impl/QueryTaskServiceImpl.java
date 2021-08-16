package com.chen.data.analysis.admin.service.impl;

import com.chen.data.analysis.admin.dto.QueryTaskDTO;
import com.chen.data.analysis.admin.service.QueryTaskService;

import java.util.List;


public class QueryTaskServiceImpl implements QueryTaskService {


    @Override
    public boolean save(QueryTaskDTO taskDTO) {
        return false;
    }

    @Override
    public List<QueryTaskDTO> listRecentSubmitTasksOfUser(String username, int limitNum) {
        return null;
    }

    @Override
    public QueryTaskDTO getTaskById(Integer id) {
        return null;
    }
}
