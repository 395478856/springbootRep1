package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.NdbBinlogIndex;
import cn.itcast.mybatis.generator.model.NdbBinlogIndexKey;

public interface NdbBinlogIndexMapper {
    int deleteByPrimaryKey(NdbBinlogIndexKey key);

    int insert(NdbBinlogIndex record);

    int insertSelective(NdbBinlogIndex record);

    NdbBinlogIndex selectByPrimaryKey(NdbBinlogIndexKey key);

    int updateByPrimaryKeySelective(NdbBinlogIndex record);

    int updateByPrimaryKey(NdbBinlogIndex record);
}