package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.CharacterSets;

public interface CharacterSetsMapper {
    int insert(CharacterSets record);

    int insertSelective(CharacterSets record);
}