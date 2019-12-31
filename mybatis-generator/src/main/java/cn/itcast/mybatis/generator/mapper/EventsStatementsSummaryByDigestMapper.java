package cn.itcast.mybatis.generator.mapper;

import cn.itcast.mybatis.generator.model.EventsStatementsSummaryByDigest;

public interface EventsStatementsSummaryByDigestMapper {
    int insert(EventsStatementsSummaryByDigest record);

    int insertSelective(EventsStatementsSummaryByDigest record);
}