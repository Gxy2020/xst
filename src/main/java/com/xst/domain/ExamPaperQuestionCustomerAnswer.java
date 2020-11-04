package com.xst.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author GUO
 * @Classname ExamPaperQuestionCustomerAnswer
 * @Description 完成试卷结果
 * @Date 2020/11/4 8:33
 */
public class ExamPaperQuestionCustomerAnswer implements Serializable {

    private static final long serialVersionUID = 3389482731220342366L;

    private Integer id;
    /*题目id*/
    private Integer questionId;
    /*试卷id*/
    private Integer examPaperId;
    /*试卷答案id*/
    private Integer examPaperAnswerId;
    /*试题类型(1.单选题  2.多选题  3.判断题 4.填空题 5.简答题)*/
    private Integer questionType;
    /*学科id*/
    private Integer subjectId;
    /*实际得分*/
    private Integer customerScore;
    /*题目原始分数*/
    private Integer questionScore;
    /*问题内容*/
    private Integer questionTextContentId;
    /*做题者的答案*/
    private String answer;
    /*做题内容*/
    private Integer textContentId;
    /*是否正确*/
    private Boolean doRight;
    /*做题人*/
    private Integer createUser;
    /*创建试卷*/
    private Date createTime;

    private Integer itemOrder;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getExamPaperId() {
        return examPaperId;
    }

    public void setExamPaperId(Integer examPaperId) {
        this.examPaperId = examPaperId;
    }

    public Integer getExamPaperAnswerId() {
        return examPaperAnswerId;
    }

    public void setExamPaperAnswerId(Integer examPaperAnswerId) {
        this.examPaperAnswerId = examPaperAnswerId;
    }

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getCustomerScore() {
        return customerScore;
    }

    public void setCustomerScore(Integer customerScore) {
        this.customerScore = customerScore;
    }

    public Integer getQuestionScore() {
        return questionScore;
    }

    public void setQuestionScore(Integer questionScore) {
        this.questionScore = questionScore;
    }

    public Integer getQuestionTextContentId() {
        return questionTextContentId;
    }

    public void setQuestionTextContentId(Integer questionTextContentId) {
        this.questionTextContentId = questionTextContentId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public Integer getTextContentId() {
        return textContentId;
    }

    public void setTextContentId(Integer textContentId) {
        this.textContentId = textContentId;
    }

    public Boolean getDoRight() {
        return doRight;
    }

    public void setDoRight(Boolean doRight) {
        this.doRight = doRight;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getItemOrder() {
        return itemOrder;
    }

    public void setItemOrder(Integer itemOrder) {
        this.itemOrder = itemOrder;
    }
}

