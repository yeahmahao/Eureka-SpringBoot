package com.zt.server.service;

import com.zt.server.model.task;

import java.util.List;

/**
 * @Author: ac
 * @Description:
 * @Date: Created in 9:09 2020/3/16
 * @Modified By:
 */

public interface taskService {
    List<task> findAll(task task);
    int deleteByTaskNo(String taskNo);
    int insertTask(task task);
    int updateTask(task task);
}
