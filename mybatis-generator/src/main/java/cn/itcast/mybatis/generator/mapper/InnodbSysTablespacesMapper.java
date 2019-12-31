package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbSysTablespaces;

public interface InnodbSysTablespacesMapper {
    int insert(InnodbSysTablespaces record);

    int insertSelective(InnodbSysTablespaces record);
}