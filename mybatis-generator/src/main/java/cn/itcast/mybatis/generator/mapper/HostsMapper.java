package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Hosts;

public interface HostsMapper {
    int insert(Hosts record);

    int insertSelective(Hosts record);
}