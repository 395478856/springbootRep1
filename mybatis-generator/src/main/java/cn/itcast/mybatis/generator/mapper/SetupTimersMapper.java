package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.SetupTimers;

public interface SetupTimersMapper {
    int insert(SetupTimers record);

    int insertSelective(SetupTimers record);
}