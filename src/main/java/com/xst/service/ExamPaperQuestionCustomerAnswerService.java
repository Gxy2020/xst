package com.xst.service;

import com.github.pagehelper.PageInfo;
import com.xst.domain.ExamPaperQuestionCustomerAnswer;
import com.xst.domain.other.ExamPaperAnswerUpdate;
import com.xst.viewmodel.student.exam.ExamPaperSubmitItemVM;
import com.xst.viewmodel.student.question.answer.QuestionPageStudentRequestVM;

import java.util.List;

/**
 * @author GUO
 * @Classname ExamPaperQuestionCustomerAnswerService
 * @Description TODO
 * @Date 2020/11/16 20:37
 */
public interface ExamPaperQuestionCustomerAnswerService extends BaseService<ExamPaperQuestionCustomerAnswer> {

    PageInfo<ExamPaperQuestionCustomerAnswer> studentPage(QuestionPageStudentRequestVM requestVM);

    List<ExamPaperQuestionCustomerAnswer> selectListByPaperAnswerId(Integer id);

    /**
     * 试卷提交答案入库
     *
     * @param examPaperQuestionCustomerAnswers List<ExamPaperQuestionCustomerAnswer>
     */
    void insertList(List<ExamPaperQuestionCustomerAnswer> examPaperQuestionCustomerAnswers);

    /**
     * 试卷问题答题信息转成ViewModel 传给前台
     *
     * @param qa ExamPaperQuestionCustomerAnswer
     * @return ExamPaperSubmitItemVM
     */
    ExamPaperSubmitItemVM examPaperQuestionCustomerAnswerToVM(ExamPaperQuestionCustomerAnswer qa);


    Integer selectAllCount();

    List<Integer> selectMothCount();

    int updateScore(List<ExamPaperAnswerUpdate> examPaperAnswerUpdates);
}
