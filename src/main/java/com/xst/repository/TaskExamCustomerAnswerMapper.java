package com.xst.repository;

import com.xst.domain.TaskExamCustomerAnswer;

public interface TaskExamCustomerAnswerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaskExamCustomerAnswer record);

    int insertSelective(TaskExamCustomerAnswer record);

    TaskExamCustomerAnswer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaskExamCustomerAnswer record);

    int updateByPrimaryKey(TaskExamCustomerAnswer record);
}