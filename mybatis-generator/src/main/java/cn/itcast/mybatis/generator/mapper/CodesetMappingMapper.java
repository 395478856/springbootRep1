package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.CodesetMapping;

public interface CodesetMappingMapper {
    int deleteByPrimaryKey(Integer codesetMappingId);

    int insert(CodesetMapping record);

    int insertSelective(CodesetMapping record);

    CodesetMapping selectByPrimaryKey(Integer codesetMappingId);

    int updateByPrimaryKeySelective(CodesetMapping record);

    int updateByPrimaryKey(CodesetMapping record);
}