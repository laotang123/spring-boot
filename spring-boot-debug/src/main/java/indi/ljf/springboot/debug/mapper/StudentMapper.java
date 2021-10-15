package indi.ljf.springboot.debug.mapper;

import indi.ljf.springboot.debug.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student student);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}