package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Threads;

public interface ThreadsMapper {
    int insert(Threads record);

    int insertSelective(Threads record);
}