package com.xst.viewmodel.admin.dashboard;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(description = "首页的数据VM")
public class IndexVM {
    @ApiModelProperty("试卷数")
    private Integer examPaperCount;
    @ApiModelProperty("题目数")
    private Integer questionCount;
    @ApiModelProperty("已做试卷数")
    private Integer doExamPaperCount;
    @ApiModelProperty("已做题目")
    private Integer doQuestionCount;
    @ApiModelProperty("日活跃用户")
    private List<Integer> mothDayUserActionValue;
    @ApiModelProperty("月活跃已做用户")
    private List<Integer> mothDayDoExamQuestionValue;
    @ApiModelProperty("月活跃用户")
    private List<String> mothDayText;
}
