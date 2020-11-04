package com.xst.domain.question;

import lombok.Data;

/**
 * @author GUO
 * @Classname QuestionItemObject
 * @Description 试题单个选项内容
 * @Date 2020/11/4 9:19
 */
@Data
public class QuestionItemObject {
    /*选项*/
    private String prefix;
    /*内容*/
    private String content;
    /*分数*/
    private Integer score;
}
