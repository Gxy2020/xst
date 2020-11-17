package com.xst.service;

import com.github.pagehelper.PageInfo;
import com.xst.domain.Subject;
import com.xst.viewmodel.admin.education.SubjectPageRequestVM;

import java.util.List;

/**
 * @author GUO
 * @Classname SubjectService
 * @Description TODO
 * @Date 2020/11/16 20:40
 */
public interface SubjectService extends BaseService<Subject> {

    List<Subject> getSubjectByLevel(Integer level);

    List<Subject> allSubject();

    Integer levelBySubjectId(Integer id);

    PageInfo<Subject> page(SubjectPageRequestVM requestVM);
}