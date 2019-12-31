package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Processlist;

public interface ProcesslistMapper {
    int insert(Processlist record);

    int insertSelective(Processlist record);
}