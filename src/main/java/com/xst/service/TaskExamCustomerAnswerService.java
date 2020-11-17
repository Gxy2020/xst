package com.xst.service;

import com.xst.domain.ExamPaper;
import com.xst.domain.ExamPaperAnswer;
import com.xst.domain.TaskExamCustomerAnswer;

import java.util.Date;
import java.util.List;

/**
 * @author GUO
 * @Classname TaskExamCustomerAnswerService
 * @Description TODO
 * @Date 2020/11/16 20:40
 */
public interface TaskExamCustomerAnswerService extends BaseService<TaskExamCustomerAnswer> {

    void insertOrUpdate(ExamPaper examPaper, ExamPaperAnswer examPaperAnswer, Date now);

    TaskExamCustomerAnswer selectByTUid(Integer tid, Integer uid);

    List<TaskExamCustomerAnswer> selectByTUid(List<Integer> taskIds, Integer uid);
}