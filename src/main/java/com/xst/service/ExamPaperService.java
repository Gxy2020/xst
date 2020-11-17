package com.xst.service;

import com.github.pagehelper.PageInfo;
import com.xst.domain.ExamPaper;
import com.xst.domain.User;
import com.xst.viewmodel.admin.exam.ExamPaperEditRequestVM;
import com.xst.viewmodel.admin.exam.ExamPaperPageRequestVM;
import com.xst.viewmodel.student.dashboard.PaperFilter;
import com.xst.viewmodel.student.dashboard.PaperInfo;
import com.xst.viewmodel.student.exam.ExamPaperPageVM;

import java.util.List;

/**
 * @author GUO
 * @Classname ExamPaperService
 * @Description TODO
 * @Date 2020/11/16 20:38
 */
public interface ExamPaperService extends BaseService<ExamPaper> {

    PageInfo<ExamPaper> page(ExamPaperPageRequestVM requestVM);

    PageInfo<ExamPaper> taskExamPage(ExamPaperPageRequestVM requestVM);

    PageInfo<ExamPaper> studentPage(ExamPaperPageVM requestVM);

    ExamPaper savePaperFromVM(ExamPaperEditRequestVM examPaperEditRequestVM, User user);

    ExamPaperEditRequestVM examPaperToVM(Integer id);

    List<PaperInfo> indexPaper(PaperFilter paperFilter);

    Integer selectAllCount();

    List<Integer> selectMothCount();
}