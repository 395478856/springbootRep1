package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.ReferentialConstraints;

public interface ReferentialConstraintsMapper {
    int insert(ReferentialConstraints record);

    int insertSelective(ReferentialConstraints record);
}