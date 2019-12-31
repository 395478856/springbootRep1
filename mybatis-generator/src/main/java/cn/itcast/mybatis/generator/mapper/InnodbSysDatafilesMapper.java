package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbSysDatafiles;

public interface InnodbSysDatafilesMapper {
    int insert(InnodbSysDatafiles record);

    int insertSelective(InnodbSysDatafiles record);
}