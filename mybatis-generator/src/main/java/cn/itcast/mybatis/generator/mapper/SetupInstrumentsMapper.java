package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.SetupInstruments;

public interface SetupInstrumentsMapper {
    int insert(SetupInstruments record);

    int insertSelective(SetupInstruments record);
}