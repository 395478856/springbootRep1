package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.SlaveMasterInfo;
import cn.itcast.mybatis.generator.model.SlaveMasterInfoKey;
import cn.itcast.mybatis.generator.model.SlaveMasterInfoWithBLOBs;

public interface SlaveMasterInfoMapper {
    int deleteByPrimaryKey(SlaveMasterInfoKey key);

    int insert(SlaveMasterInfoWithBLOBs record);

    int insertSelective(SlaveMasterInfoWithBLOBs record);

    SlaveMasterInfoWithBLOBs selectByPrimaryKey(SlaveMasterInfoKey key);

    int updateByPrimaryKeySelective(SlaveMasterInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SlaveMasterInfoWithBLOBs record);

    int updateByPrimaryKey(SlaveMasterInfo record);
}