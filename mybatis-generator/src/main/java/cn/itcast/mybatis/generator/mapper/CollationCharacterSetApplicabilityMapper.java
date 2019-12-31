package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.CollationCharacterSetApplicability;

public interface CollationCharacterSetApplicabilityMapper {
    int insert(CollationCharacterSetApplicability record);

    int insertSelective(CollationCharacterSetApplicability record);
}