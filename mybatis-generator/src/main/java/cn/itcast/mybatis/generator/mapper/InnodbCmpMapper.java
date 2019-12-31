package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbCmp;

public interface InnodbCmpMapper {
    int insert(InnodbCmp record);

    int insertSelective(InnodbCmp record);
}