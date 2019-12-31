package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.HostCache;

public interface HostCacheMapper {
    int insert(HostCache record);

    int insertSelective(HostCache record);
}