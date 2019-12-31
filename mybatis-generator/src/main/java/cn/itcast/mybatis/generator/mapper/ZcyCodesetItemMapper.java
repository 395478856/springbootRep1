package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.ZcyCodesetItem;

public interface ZcyCodesetItemMapper {
    int deleteByPrimaryKey(Long zcyCodesetItemId);

    int insert(ZcyCodesetItem record);

    int insertSelective(ZcyCodesetItem record);

    ZcyCodesetItem selectByPrimaryKey(Long zcyCodesetItemId);

    int updateByPrimaryKeySelective(ZcyCodesetItem record);

    int updateByPrimaryKeyWithBLOBs(ZcyCodesetItem record);

    int updateByPrimaryKey(ZcyCodesetItem record);
}