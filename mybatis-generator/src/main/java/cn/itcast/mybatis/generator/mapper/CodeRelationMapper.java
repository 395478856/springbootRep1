package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.CodeRelation;

public interface CodeRelationMapper {
    int deleteByPrimaryKey(Long relationId);

    int insert(CodeRelation record);

    int insertSelective(CodeRelation record);

    CodeRelation selectByPrimaryKey(Long relationId);

    int updateByPrimaryKeySelective(CodeRelation record);

    int updateByPrimaryKey(CodeRelation record);
}