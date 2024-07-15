package edu.jsu.service;

import com.github.pagehelper.PageInfo;
import edu.jsu.pojo.domain.Course;
import edu.jsu.pojo.query.CourseQuery;
import edu.jsu.pojo.vo.CourseVO;

/**
 * @Author: yiwang
 * @Date: 2024/7/13
 */
public interface CourseService {
    PageInfo<Course> findAllCourseByPage(CourseQuery courseQuery);

    int addCourse(Course course);

    int addOrUpdateCourseByCourseVO(CourseVO courseVO);

    Course findByCourseId(Integer id);

    int updateStatus(Integer id, Integer status);

//    void saveCourseOrTeacher(CourseVO courseVO);
}
