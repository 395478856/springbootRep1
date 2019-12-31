package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.SetupObjects;

public interface SetupObjectsMapper {
    int insert(SetupObjects record);

    int insertSelective(SetupObjects record);
}