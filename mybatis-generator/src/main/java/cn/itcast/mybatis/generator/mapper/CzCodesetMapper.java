package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.CzCodeset;

public interface CzCodesetMapper {
    int deleteByPrimaryKey(Long czCodesetId);

    int insert(CzCodeset record);

    int insertSelective(CzCodeset record);

    CzCodeset selectByPrimaryKey(Long czCodesetId);

    int updateByPrimaryKeySelective(CzCodeset record);

    int updateByPrimaryKey(CzCodeset record);
}