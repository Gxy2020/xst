package com.xst.repository;

import com.xst.domain.MessageUser;

public interface MessageUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MessageUser record);

    int insertSelective(MessageUser record);

    MessageUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MessageUser record);

    int updateByPrimaryKey(MessageUser record);
}