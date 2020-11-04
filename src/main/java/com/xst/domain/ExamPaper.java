package com.xst.domain;

import java.util.Date;

/**
 * @author GUO
 * @Classname ExamPaper
 * @Description 试卷
 * @Date 2020/11/4 8:00
 */
public class ExamPaper {

    private static final long serialVersionUID = 8509645224550501395L;
    /*试卷id*/
    private Integer id;
    /*试卷名称*/
    private String name;
    /*学科*/
    private Integer subjectId;
    /* 试卷类型( 1固定试卷  2临时试卷 3班级试卷 4.时段试卷 5.推送试卷,6任务试卷)*/
    private Integer paperType;
    /*级别*/
    private Integer gradeLevel;
    /*试卷总分*/
    private Integer score;
    /*题目数量*/
    private Integer questionCount;
    /*建议时长*/
    private Integer suggestTime;
    /*时段试卷,开始时间*/
    private Date limitStartTime;
    /*时段试卷,结束时间*/
    private Date limitEndTime;
    /*试卷框架 内容为JSON*/
    private Integer frameTextContentId;
    /*创建者*/
    private Integer createUser;
    /*创建时间*/
    private Date createTime;
    /*是否存在*/
    private Boolean deleted;
    /*任务试卷id*/
    private Integer taskExamId;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getPaperType() {
        return paperType;
    }

    public void setPaperType(Integer paperType) {
        this.paperType = paperType;
    }

    public Integer getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(Integer gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(Integer questionCount) {
        this.questionCount = questionCount;
    }

    public Integer getSuggestTime() {
        return suggestTime;
    }

    public void setSuggestTime(Integer suggestTime) {
        this.suggestTime = suggestTime;
    }

    public Date getLimitStartTime() {
        return limitStartTime;
    }

    public void setLimitStartTime(Date limitStartTime) {
        this.limitStartTime = limitStartTime;
    }

    public Date getLimitEndTime() {
        return limitEndTime;
    }

    public void setLimitEndTime(Date limitEndTime) {
        this.limitEndTime = limitEndTime;
    }

    public Integer getFrameTextContentId() {
        return frameTextContentId;
    }

    public void setFrameTextContentId(Integer frameTextContentId) {
        this.frameTextContentId = frameTextContentId;
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Integer getTaskExamId() {
        return taskExamId;
    }

    public void setTaskExamId(Integer taskExamId) {
        this.taskExamId = taskExamId;
    }
}
