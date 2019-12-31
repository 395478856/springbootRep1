package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Plugin;

public interface PluginMapper {
    int deleteByPrimaryKey(String name);

    int insert(Plugin record);

    int insertSelective(Plugin record);

    Plugin selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(Plugin record);

    int updateByPrimaryKey(Plugin record);
}