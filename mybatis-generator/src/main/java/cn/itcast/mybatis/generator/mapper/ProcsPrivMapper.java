package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.ProcsPriv;
import cn.itcast.mybatis.generator.model.ProcsPrivKey;

public interface ProcsPrivMapper {
    int deleteByPrimaryKey(ProcsPrivKey key);

    int insert(ProcsPriv record);

    int insertSelective(ProcsPriv record);

    ProcsPriv selectByPrimaryKey(ProcsPrivKey key);

    int updateByPrimaryKeySelective(ProcsPriv record);

    int updateByPrimaryKey(ProcsPriv record);
}