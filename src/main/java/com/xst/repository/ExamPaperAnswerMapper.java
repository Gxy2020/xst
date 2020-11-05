package com.xst.repository;

import com.xst.domain.ExamPaperAnswer;

public interface ExamPaperAnswerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamPaperAnswer record);

    int insertSelective(ExamPaperAnswer record);

    ExamPaperAnswer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamPaperAnswer record);

    int updateByPrimaryKey(ExamPaperAnswer record);
}