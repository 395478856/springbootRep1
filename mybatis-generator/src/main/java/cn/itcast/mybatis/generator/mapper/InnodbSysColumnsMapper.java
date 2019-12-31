package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbSysColumns;

public interface InnodbSysColumnsMapper {
    int insert(InnodbSysColumns record);

    int insertSelective(InnodbSysColumns record);
}