package com.xst.repository;

import com.xst.domain.UserEventLog;

public interface UserEventLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserEventLog record);

    int insertSelective(UserEventLog record);

    UserEventLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEventLog record);

    int updateByPrimaryKeyWithBLOBs(UserEventLog record);

    int updateByPrimaryKey(UserEventLog record);
}