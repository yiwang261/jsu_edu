package edu.jsu.mapper;

import edu.jsu.pojo.domain.CourseSection;

/**
* @author yiwan
* @description 针对表【course_section】的数据库操作Mapper
* @createDate 2024-07-13 11:16:08
* @Entity edu.jsu.pojo.domain.CourseSection
*/
public interface CourseSectionMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CourseSection record);

    int insertSelective(CourseSection record);

    CourseSection selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CourseSection record);

    int updateByPrimaryKey(CourseSection record);

}
