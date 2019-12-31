package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.ColumnsPriv;
import cn.itcast.mybatis.generator.model.ColumnsPrivKey;

public interface ColumnsPrivMapper {
    int deleteByPrimaryKey(ColumnsPrivKey key);

    int insert(ColumnsPriv record);

    int insertSelective(ColumnsPriv record);

    ColumnsPriv selectByPrimaryKey(ColumnsPrivKey key);

    int updateByPrimaryKeySelective(ColumnsPriv record);

    int updateByPrimaryKey(ColumnsPriv record);
}