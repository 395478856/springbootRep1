package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.SlaveWorkerInfo;
import cn.itcast.mybatis.generator.model.SlaveWorkerInfoWithBLOBs;

public interface SlaveWorkerInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SlaveWorkerInfoWithBLOBs record);

    int insertSelective(SlaveWorkerInfoWithBLOBs record);

    SlaveWorkerInfoWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SlaveWorkerInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SlaveWorkerInfoWithBLOBs record);

    int updateByPrimaryKey(SlaveWorkerInfo record);
}