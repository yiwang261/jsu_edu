package edu.jsu.mapper;

import edu.jsu.pojo.domain.Course;
import edu.jsu.pojo.query.CourseQuery;
import edu.jsu.pojo.vo.CourseContentVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author yiwan
* @description 针对表【course】的数据库操作Mapper
* @createDate 2024-07-13 11:16:08
* @Entity edu.jsu.pojo.domain.Course
*/
public interface CourseMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

    List<Course> findAllCourseByPage(CourseQuery courseQuery);

    Course findByCourseId(Integer id);

    int updateStatus(@Param("id") Integer id,@Param("status") Integer status);

    CourseContentVO findCourseContentByCourseId(Integer courseId);
}
