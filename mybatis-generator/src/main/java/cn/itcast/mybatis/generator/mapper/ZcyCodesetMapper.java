package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.ZcyCodeset;

public interface ZcyCodesetMapper {
    int deleteByPrimaryKey(Long zcyCodesetId);

    int insert(ZcyCodeset record);

    int insertSelective(ZcyCodeset record);

    ZcyCodeset selectByPrimaryKey(Long zcyCodesetId);

    int updateByPrimaryKeySelective(ZcyCodeset record);

    int updateByPrimaryKey(ZcyCodeset record);
}