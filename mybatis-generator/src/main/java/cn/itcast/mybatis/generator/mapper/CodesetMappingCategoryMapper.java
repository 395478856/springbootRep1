package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.CodesetMappingCategory;

public interface CodesetMappingCategoryMapper {
    int deleteByPrimaryKey(Long codesetMappingCategoryId);

    int insert(CodesetMappingCategory record);

    int insertSelective(CodesetMappingCategory record);

    CodesetMappingCategory selectByPrimaryKey(Long codesetMappingCategoryId);

    int updateByPrimaryKeySelective(CodesetMappingCategory record);

    int updateByPrimaryKeyWithBLOBs(CodesetMappingCategory record);

    int updateByPrimaryKey(CodesetMappingCategory record);
}