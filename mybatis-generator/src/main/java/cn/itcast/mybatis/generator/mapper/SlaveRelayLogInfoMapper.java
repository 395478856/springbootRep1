package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.SlaveRelayLogInfo;
import cn.itcast.mybatis.generator.model.SlaveRelayLogInfoWithBLOBs;

public interface SlaveRelayLogInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SlaveRelayLogInfoWithBLOBs record);

    int insertSelective(SlaveRelayLogInfoWithBLOBs record);

    SlaveRelayLogInfoWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SlaveRelayLogInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SlaveRelayLogInfoWithBLOBs record);

    int updateByPrimaryKey(SlaveRelayLogInfo record);
}