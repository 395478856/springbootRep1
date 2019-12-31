package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.TableConstraints;

public interface TableConstraintsMapper {
    int insert(TableConstraints record);

    int insertSelective(TableConstraints record);
}