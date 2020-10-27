package cn.pzhu.geny.mapper;

import cn.pzhu.geny.pojo.Major;

public interface MajorMapper {
    int deleteByPrimaryKey(Integer actId);

    int insert(Major record);

    int insertSelective(Major record);

    Major selectByPrimaryKey(Integer actId);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);
}