package edu.jsu.mapper;

import edu.jsu.pojo.domain.Teacher;

/**
* @author yiwan
* @description 针对表【teacher】的数据库操作Mapper
* @createDate 2024-07-13 11:16:08
* @Entity edu.jsu.pojo.domain.Teacher
*/
public interface TeacherMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    Teacher findTeacherByTeacherName(String teacherName);
}
