package com.xst.domain.task;

import lombok.Data;

/**
 * @author GUO
 * @Classname TaskItemAnswerObject
 * @Description 任务试卷的答案及状态
 * @Date 2020/11/4 10:13
 */
@Data
public class TaskItemAnswerObject {

    private Integer examPaperId;
    private Integer examPaperAnswerId;
    private Integer status;

    public TaskItemAnswerObject(){
    }

    public TaskItemAnswerObject(Integer examPaperId, Integer examPaperAnswerId, Integer status) {
        this.examPaperId = examPaperId;
        this.examPaperAnswerId = examPaperAnswerId;
        this.status = status;
    }
}
