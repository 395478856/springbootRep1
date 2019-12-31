package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.HelpKeyword;

public interface HelpKeywordMapper {
    int deleteByPrimaryKey(Integer helpKeywordId);

    int insert(HelpKeyword record);

    int insertSelective(HelpKeyword record);

    HelpKeyword selectByPrimaryKey(Integer helpKeywordId);

    int updateByPrimaryKeySelective(HelpKeyword record);

    int updateByPrimaryKey(HelpKeyword record);
}