package com.xst.domain.exam;

import lombok.Data;

import java.util.List;

/**
 * @author GUO
 * @Classname ExamPaperTitleItemObject
 * @Description 试卷内容
 * @Date 2020/11/4 9:27
 */
@Data
public class ExamPaperTitleItemObject {
    /*试卷名字*/
    private String name;
    /*试卷的试题列表*/
    private List<ExamPaperQuestionItemObject> questionItems;
}
