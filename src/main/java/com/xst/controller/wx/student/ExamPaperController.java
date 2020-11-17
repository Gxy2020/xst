package com.xst.controller.wx.student;


import com.github.pagehelper.PageInfo;
import com.xst.base.RestResponse;
import com.xst.controller.wx.BaseWXApiController;
import com.xst.domain.ExamPaper;
import com.xst.domain.Subject;
import com.xst.service.ExamPaperService;
import com.xst.service.SubjectService;
import com.xst.utility.DateTimeUtil;
import com.xst.utility.PageInfoHelper;
import com.xst.viewmodel.admin.exam.ExamPaperEditRequestVM;
import com.xst.viewmodel.student.exam.ExamPaperPageResponseVM;
import com.xst.viewmodel.student.exam.ExamPaperPageVM;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;


@Controller("WXStudentExamController")
@RequestMapping(value = "/api/wx/student/exampaper")
@AllArgsConstructor
@ResponseBody
public class ExamPaperController extends BaseWXApiController {

    private final ExamPaperService examPaperService;
    private final SubjectService subjectService;


    @RequestMapping(value = "/select/{id}", method = RequestMethod.POST)
    public RestResponse<ExamPaperEditRequestVM> select(@PathVariable Integer id) {
        ExamPaperEditRequestVM vm = examPaperService.examPaperToVM(id);
        return RestResponse.ok(vm);
    }


    @RequestMapping(value = "/pageList", method = RequestMethod.POST)
    public RestResponse<PageInfo<ExamPaperPageResponseVM>> pageList(@Valid ExamPaperPageVM model) {
        model.setLevelId(getCurrentUser().getUserLevel());
        PageInfo<ExamPaper> pageInfo = examPaperService.studentPage(model);
        PageInfo<ExamPaperPageResponseVM> page = PageInfoHelper.copyMap(pageInfo, e -> {
            ExamPaperPageResponseVM vm = modelMapper.map(e, ExamPaperPageResponseVM.class);
            Subject subject = subjectService.selectById(vm.getSubjectId());
            vm.setSubjectName(subject.getName());
            vm.setCreateTime(DateTimeUtil.dateFormat(e.getCreateTime()));
            return vm;
        });
        return RestResponse.ok(page);
    }
}
