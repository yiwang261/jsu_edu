package edu.jsu.mapper;

import edu.jsu.pojo.domain.CourseLesson;

/**
* @author yiwan
* @description 针对表【course_lesson(课程节内容)】的数据库操作Mapper
* @createDate 2024-07-13 11:16:08
* @Entity edu.jsu.pojo.domain.CourseLesson
*/
public interface CourseLessonMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CourseLesson record);

    int insertSelective(CourseLesson record);

    CourseLesson selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CourseLesson record);

    int updateByPrimaryKey(CourseLesson record);

}
