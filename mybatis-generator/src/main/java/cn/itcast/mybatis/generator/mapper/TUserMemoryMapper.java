package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.TUserMemory;

public interface TUserMemoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUserMemory record);

    int insertSelective(TUserMemory record);

    TUserMemory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUserMemory record);

    int updateByPrimaryKey(TUserMemory record);
}