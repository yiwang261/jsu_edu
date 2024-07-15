package edu.jsu.mapper;

import edu.jsu.pojo.domain.CourseMedia;

/**
* @author yiwan
* @description 针对表【course_media】的数据库操作Mapper
* @createDate 2024-07-13 11:16:08
* @Entity edu.jsu.pojo.domain.CourseMedia
*/
public interface CourseMediaMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CourseMedia record);

    int insertSelective(CourseMedia record);

    CourseMedia selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CourseMedia record);

    int updateByPrimaryKey(CourseMedia record);

}
