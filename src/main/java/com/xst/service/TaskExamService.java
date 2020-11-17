package com.xst.service;

import com.github.pagehelper.PageInfo;
import com.xst.domain.TaskExam;
import com.xst.domain.User;
import com.xst.viewmodel.admin.task.TaskPageRequestVM;
import com.xst.viewmodel.admin.task.TaskRequestVM;

import java.util.List;

/**
 * @author GUO
 * @Classname TaskExamService
 * @Description TODO
 * @Date 2020/11/16 20:40
 */
public interface TaskExamService extends BaseService<TaskExam> {

    PageInfo<TaskExam> page(TaskPageRequestVM requestVM);

    void edit(TaskRequestVM model, User user);

    TaskRequestVM taskExamToVM(Integer id);

    List<TaskExam> getByGradeLevel(Integer gradeLevel);
}
