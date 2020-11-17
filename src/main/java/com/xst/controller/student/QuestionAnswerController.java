package com.xst.controller.student;


import com.github.pagehelper.PageInfo;
import com.xst.base.BaseApiController;
import com.xst.base.RestResponse;
import com.xst.domain.ExamPaperQuestionCustomerAnswer;
import com.xst.domain.Subject;
import com.xst.domain.TextContent;
import com.xst.domain.question.QuestionObject;
import com.xst.service.ExamPaperQuestionCustomerAnswerService;
import com.xst.service.QuestionService;
import com.xst.service.SubjectService;
import com.xst.service.TextContentService;
import com.xst.utility.DateTimeUtil;
import com.xst.utility.HtmlUtil;
import com.xst.utility.JsonUtil;
import com.xst.utility.PageInfoHelper;
import com.xst.viewmodel.admin.question.QuestionEditRequestVM;
import com.xst.viewmodel.student.exam.ExamPaperSubmitItemVM;
import com.xst.viewmodel.student.question.answer.QuestionAnswerVM;
import com.xst.viewmodel.student.question.answer.QuestionPageStudentRequestVM;
import com.xst.viewmodel.student.question.answer.QuestionPageStudentResponseVM;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("StudentQuestionAnswerController")
@RequestMapping(value = "/api/student/question/answer")
@AllArgsConstructor
public class QuestionAnswerController extends BaseApiController {

    private final ExamPaperQuestionCustomerAnswerService examPaperQuestionCustomerAnswerService;
    private final QuestionService questionService;
    private final TextContentService textContentService;
    private final SubjectService subjectService;

    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public RestResponse<PageInfo<QuestionPageStudentResponseVM>> pageList(@RequestBody QuestionPageStudentRequestVM model) {
        model.setCreateUser(getCurrentUser().getId());
        PageInfo<ExamPaperQuestionCustomerAnswer> pageInfo = examPaperQuestionCustomerAnswerService.studentPage(model);
        PageInfo<QuestionPageStudentResponseVM> page = PageInfoHelper.copyMap(pageInfo, q -> {
            Subject subject = subjectService.selectById(q.getSubjectId());
            QuestionPageStudentResponseVM vm = modelMapper.map(q, QuestionPageStudentResponseVM.class);
            vm.setCreateTime(DateTimeUtil.dateFormat(q.getCreateTime()));
            TextContent textContent = textContentService.selectById(q.getQuestionTextContentId());
            QuestionObject questionObject = JsonUtil.toJsonObject(textContent.getContent(), QuestionObject.class);
            String clearHtml = HtmlUtil.clear(questionObject.getTitleContent());
            vm.setShortTitle(clearHtml);
            vm.setSubjectName(subject.getName());
            return vm;
        });
        return RestResponse.ok(page);
    }


    @RequestMapping(value = "/select/{id}", method = RequestMethod.POST)
    public RestResponse<QuestionAnswerVM> select(@PathVariable Integer id) {
        QuestionAnswerVM vm = new QuestionAnswerVM();
        ExamPaperQuestionCustomerAnswer examPaperQuestionCustomerAnswer = examPaperQuestionCustomerAnswerService.selectById(id);
        ExamPaperSubmitItemVM questionAnswerVM = examPaperQuestionCustomerAnswerService.examPaperQuestionCustomerAnswerToVM(examPaperQuestionCustomerAnswer);
        QuestionEditRequestVM questionVM = questionService.getQuestionEditRequestVM(examPaperQuestionCustomerAnswer.getQuestionId());
        vm.setQuestionVM(questionVM);
        vm.setQuestionAnswerVM(questionAnswerVM);
        return RestResponse.ok(vm);
    }

}
