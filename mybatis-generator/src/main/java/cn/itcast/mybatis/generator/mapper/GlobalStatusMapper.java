package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.GlobalStatus;

public interface GlobalStatusMapper {
    int insert(GlobalStatus record);

    int insertSelective(GlobalStatus record);
}