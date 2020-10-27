package cn.pzhu.geny.mapper;

import cn.pzhu.geny.pojo.Message;

public interface MessageMapper {
    int deleteByPrimaryKey(Integer actId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer actId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}