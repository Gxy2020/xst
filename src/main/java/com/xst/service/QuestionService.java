package com.xst.service;

import com.github.pagehelper.PageInfo;
import com.xst.domain.Question;
import com.xst.viewmodel.admin.question.QuestionEditRequestVM;
import com.xst.viewmodel.admin.question.QuestionPageRequestVM;

import java.util.List;

/**
 * @author GUO
 * @Classname QuestionService
 * @Description TODO
 * @Date 2020/11/16 20:39
 */
public interface QuestionService extends BaseService<Question> {

    PageInfo<Question> page(QuestionPageRequestVM requestVM);

    Question insertFullQuestion(QuestionEditRequestVM model, Integer userId);

    Question updateFullQuestion(QuestionEditRequestVM model);

    QuestionEditRequestVM getQuestionEditRequestVM(Integer questionId);

    QuestionEditRequestVM getQuestionEditRequestVM(Question question);

    Integer selectAllCount();

    List<Integer> selectMothCount();
}