package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.AgProtocolQualification;

public interface AgProtocolQualificationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AgProtocolQualification record);

    int insertSelective(AgProtocolQualification record);

    AgProtocolQualification selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AgProtocolQualification record);

    int updateByPrimaryKey(AgProtocolQualification record);
}