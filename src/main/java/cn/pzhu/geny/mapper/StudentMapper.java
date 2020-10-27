package cn.pzhu.geny.mapper;

import cn.pzhu.geny.pojo.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer actId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer actId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}