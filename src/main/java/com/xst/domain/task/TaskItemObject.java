package com.xst.domain.task;

import lombok.Data;

/**
 * @author GUO
 * @Classname TaskItemObject
 * @Description 任务试卷的单个题目
 * @Date 2020/11/4 10:13
 */
@Data
public class TaskItemObject {
    /*试卷id*/
    private Integer examPaperId;
    /*试卷名字*/
    private String examPaperName;
    /*试题序号*/
    private Integer itemOrder;
}
