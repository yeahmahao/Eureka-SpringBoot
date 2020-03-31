package com.zt.server.controller;

import com.zt.server.model.task;
import com.zt.server.service.taskService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: ac
 * @Description:
 * @Date: Created in 9:11 2020/3/16
 * @Modified By:
 */
@RestController
@CrossOrigin("*")
public class taskController {
    @Autowired
    taskService service;
    /**
     *
     * @Description: 
     * 
     * @auther: ac
     * @date: 8:50  
     * @param: [task, bindingResult]
     * @return: java.util.List<com.zt.taskmanager.model.task>
     *
     */
    @RequestMapping(value = "/findAll")
    @ApiOperation(value = "查询所有任务",notes = "")
    public List<task> findAll( task task,BindingResult bindingResult){
        System.out.println(task.getTaskStartTime());
        return service.findAll(task);
    }
    /**
     *
     * @Description: 
     * 
     * @auther: ac
     * @date: 8:50  
     * @param: [taskNo]
     * @return: int
     *
     */
    @RequestMapping("/deleteByTaskNo")
    @ApiOperation(value = "删除任务",notes = "")
    public int deleteByTaskNo(String taskNo){
        return service.deleteByTaskNo(taskNo);
    }
    /**
     *
     * @Description: 
     * 
     * @auther: ac
     * @date: 8:50  
     * @param: [task]
     * @return: int
     *
     */
    @RequestMapping(value = "/insertTask")
    @ApiOperation(value = "添加任务",notes = "")
    public int insertTask(task task){
        return service.insertTask(task);
    }
    /**
     *
     * @Description: 
     * 
     * @auther: ac
     * @date: 8:50  
     * @param: [task]
     * @return: int
     *
     */
    @RequestMapping("/updateTask")
    @ApiOperation(value = "更新任务",notes = "")
    int updateTask(task task){
        return service.updateTask(task);
    }
}
