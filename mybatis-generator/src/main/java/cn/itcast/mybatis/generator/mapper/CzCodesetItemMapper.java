package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.CzCodesetItem;

public interface CzCodesetItemMapper {
    int deleteByPrimaryKey(Long czCodesetItemId);

    int insert(CzCodesetItem record);

    int insertSelective(CzCodesetItem record);

    CzCodesetItem selectByPrimaryKey(Long czCodesetItemId);

    int updateByPrimaryKeySelective(CzCodesetItem record);

    int updateByPrimaryKeyWithBLOBs(CzCodesetItem record);

    int updateByPrimaryKey(CzCodesetItem record);
}