package cn.pzhu.geny.mapper;

import cn.pzhu.geny.pojo.Class;

public interface ClassMapper {
    int deleteByPrimaryKey(Integer actId);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(Integer actId);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}