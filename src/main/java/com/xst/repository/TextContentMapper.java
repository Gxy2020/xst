package com.xst.repository;

import com.xst.domain.TextContent;

public interface TextContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TextContent record);

    int insertSelective(TextContent record);

    TextContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TextContent record);

    int updateByPrimaryKeyWithBLOBs(TextContent record);

    int updateByPrimaryKey(TextContent record);
}