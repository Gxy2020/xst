package com.xst.viewmodel.student.question.answer;


import com.xst.viewmodel.admin.question.QuestionEditRequestVM;
import com.xst.viewmodel.student.exam.ExamPaperSubmitItemVM;
import lombok.Data;

@Data
public class QuestionAnswerVM {
    private QuestionEditRequestVM questionVM;
    private ExamPaperSubmitItemVM questionAnswerVM;
}
