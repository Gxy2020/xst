package com.xst.service;

import com.github.pagehelper.PageInfo;
import com.xst.domain.ExamPaperAnswer;
import com.xst.domain.ExamPaperAnswerInfo;
import com.xst.domain.User;
import com.xst.viewmodel.student.exam.ExamPaperSubmitVM;
import com.xst.viewmodel.student.exampaper.ExamPaperAnswerPageVM;

import java.util.List;

/**
 * @author GUO
 * @Classname ExamPaperAnswerService
 * @Description TODO
 * @Date 2020/11/16 20:37
 */
public interface ExamPaperAnswerService extends BaseService<ExamPaperAnswer> {

    /**
     * 学生考试记录分页
     *
     * @param requestVM 过滤条件
     * @return PageInfo<ExamPaperAnswer>
     */
    PageInfo<ExamPaperAnswer> studentPage(ExamPaperAnswerPageVM requestVM);

    /**
     * 计算试卷提交结果(不入库)
     *
     * @param examPaperSubmitVM
     * @param user
     * @return
     */
    ExamPaperAnswerInfo calculateExamPaperAnswer(ExamPaperSubmitVM examPaperSubmitVM, User user);


    /**
     * 试卷批改
     * @param examPaperSubmitVM  examPaperSubmitVM
     * @return String
     */
    String judge(ExamPaperSubmitVM examPaperSubmitVM);

    /**
     * 试卷答题信息转成ViewModel 传给前台
     *
     * @param id 试卷id
     * @return ExamPaperSubmitVM
     */
    ExamPaperSubmitVM examPaperAnswerToVM(Integer id);


    Integer selectAllCount();

    List<Integer> selectMothCount();
}
