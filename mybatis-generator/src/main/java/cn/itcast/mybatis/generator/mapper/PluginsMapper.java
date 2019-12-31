package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Plugins;

public interface PluginsMapper {
    int insert(Plugins record);

    int insertSelective(Plugins record);
}