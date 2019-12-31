package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbSysTables;

public interface InnodbSysTablesMapper {
    int insert(InnodbSysTables record);

    int insertSelective(InnodbSysTables record);
}