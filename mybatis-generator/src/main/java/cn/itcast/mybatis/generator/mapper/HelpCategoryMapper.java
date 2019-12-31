package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.HelpCategory;

public interface HelpCategoryMapper {
    int deleteByPrimaryKey(Short helpCategoryId);

    int insert(HelpCategory record);

    int insertSelective(HelpCategory record);

    HelpCategory selectByPrimaryKey(Short helpCategoryId);

    int updateByPrimaryKeySelective(HelpCategory record);

    int updateByPrimaryKeyWithBLOBs(HelpCategory record);

    int updateByPrimaryKey(HelpCategory record);
}