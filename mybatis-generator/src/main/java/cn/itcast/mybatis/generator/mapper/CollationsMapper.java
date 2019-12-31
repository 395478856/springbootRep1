package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.Collations;

public interface CollationsMapper {
    int insert(Collations record);

    int insertSelective(Collations record);
}