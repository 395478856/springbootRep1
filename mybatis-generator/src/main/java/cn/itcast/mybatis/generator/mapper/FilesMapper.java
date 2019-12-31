package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Files;

public interface FilesMapper {
    int insert(Files record);

    int insertSelective(Files record);
}