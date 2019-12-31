package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbSysFields;

public interface InnodbSysFieldsMapper {
    int insert(InnodbSysFields record);

    int insertSelective(InnodbSysFields record);
}