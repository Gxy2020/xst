package com.xst.domain.other;

import lombok.Data;

/**
 * @author GUO
 * @Classname ExamPaperAnswerUpdate
 * @Description TODO
 * @Date 2020/11/4 10:31
 */
@Data
public class ExamPaperAnswerUpdate {
    private Integer id;
    private Integer customerScore;
    private Boolean doRight;
}
