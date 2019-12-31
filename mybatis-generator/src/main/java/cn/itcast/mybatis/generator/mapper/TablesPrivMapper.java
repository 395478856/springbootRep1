package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.TablesPriv;
import cn.itcast.mybatis.generator.model.TablesPrivKey;

public interface TablesPrivMapper {
    int deleteByPrimaryKey(TablesPrivKey key);

    int insert(TablesPriv record);

    int insertSelective(TablesPriv record);

    TablesPriv selectByPrimaryKey(TablesPrivKey key);

    int updateByPrimaryKeySelective(TablesPriv record);

    int updateByPrimaryKey(TablesPriv record);
}