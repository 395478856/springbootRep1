package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.InnodbCmpPerIndex;

public interface InnodbCmpPerIndexMapper {
    int insert(InnodbCmpPerIndex record);

    int insertSelective(InnodbCmpPerIndex record);
}