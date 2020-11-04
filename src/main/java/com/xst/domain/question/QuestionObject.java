package com.xst.domain.question;

import lombok.Data;

import java.util.List;

/**
 * @author GUO
 * @Classname QuestionObject
 * @Description TODO
 * @Date 2020/11/4 9:20
 */
@Data
public class QuestionObject {
    /*标题*/
    private String titleContent;
    /*解析*/
    private String analyze;
    /*选项列表*/
    private List<QuestionItemObject> questionItemObjects;
    /*正确*/
    private String correct;
}
