package com.xst.service;

import com.github.pagehelper.PageInfo;
import com.xst.domain.UserEventLog;
import com.xst.viewmodel.admin.user.UserEventPageRequestVM;

import java.util.List;

/**
 * @author GUO
 * @Classname UserEventLogService
 * @Description TODO
 * @Date 2020/11/16 20:42
 */
public interface UserEventLogService extends BaseService<UserEventLog> {

    List<UserEventLog> getUserEventLogByUserId(Integer id);

    PageInfo<UserEventLog> page(UserEventPageRequestVM requestVM);

    List<Integer> selectMothCount();
}