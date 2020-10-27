package cn.pzhu.geny.mapper;

import cn.pzhu.geny.pojo.Enterprise;

public interface EnterpriseMapper {
    int deleteByPrimaryKey(Integer actId);

    int insert(Enterprise record);

    int insertSelective(Enterprise record);

    Enterprise selectByPrimaryKey(Integer actId);

    int updateByPrimaryKeySelective(Enterprise record);

    int updateByPrimaryKey(Enterprise record);
}