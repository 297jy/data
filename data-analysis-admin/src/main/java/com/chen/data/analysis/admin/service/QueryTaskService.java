package com.chen.data.analysis.admin.service;

import com.chen.data.analysis.admin.dto.QueryTaskDTO;

import java.util.List;

public interface QueryTaskService {

    boolean save(QueryTaskDTO taskDTO);

    List<QueryTaskDTO> listRecentSubmitTasksOfUser(String username, int limitNum);

    QueryTaskDTO getTaskById(Integer id);

}
