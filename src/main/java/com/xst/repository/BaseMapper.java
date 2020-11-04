package com.xst.repository;

/**
 * @author GUO
 * @Classname BaseMapper
 * @Description TODO
 * @Date 2020/11/4 11:04
 */
public interface BaseMapper<T> {
    int deleteByPrimaryKey(Integer id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
