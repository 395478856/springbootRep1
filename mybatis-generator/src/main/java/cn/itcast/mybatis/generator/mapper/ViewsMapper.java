package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Views;

public interface ViewsMapper {
    int insert(Views record);

    int insertSelective(Views record);
}