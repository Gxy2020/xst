package com.xst.domain.exam;

import lombok.Data;

/**
 * @author GUO
 * @Classname ExamPaperQuestionItemObject
 * @Description 试卷的单个题目
 * @Date 2020/11/4 9:26
 */
@Data
public class ExamPaperQuestionItemObject {
    /*题目id*/
    private Integer id;
    /*题目序号*/
    private Integer itemOrder;
}
