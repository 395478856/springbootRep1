package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbSysForeign;

public interface InnodbSysForeignMapper {
    int insert(InnodbSysForeign record);

    int insertSelective(InnodbSysForeign record);
}