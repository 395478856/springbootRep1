package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.ProxiesPriv;
import cn.itcast.mybatis.generator.model.ProxiesPrivKey;

public interface ProxiesPrivMapper {
    int deleteByPrimaryKey(ProxiesPrivKey key);

    int insert(ProxiesPriv record);

    int insertSelective(ProxiesPriv record);

    ProxiesPriv selectByPrimaryKey(ProxiesPrivKey key);

    int updateByPrimaryKeySelective(ProxiesPriv record);

    int updateByPrimaryKey(ProxiesPriv record);
}