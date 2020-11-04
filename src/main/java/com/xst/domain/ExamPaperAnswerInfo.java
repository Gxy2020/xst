package com.xst.domain;

import lombok.Data;

import java.util.List;

/**
 * @author GUO
 * @Classname ExamPaperAnswerInfo
 * @Description 试卷内容及答案
 * @Date 2020/11/4 8:32
 */
@Data
public class ExamPaperAnswerInfo {
    public ExamPaper examPaper;
    public ExamPaperAnswer examPaperAnswer;
    public List<ExamPaperQuestionCustomerAnswer> examPaperQuestionCustomerAnswers;
}
