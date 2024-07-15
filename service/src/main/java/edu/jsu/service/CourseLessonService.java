package edu.jsu.service;

import edu.jsu.pojo.vo.CourseContentVO;

/**
 * @Author: yiwang
 * @Date: 2024/7/15
 */
public interface CourseLessonService {
     CourseContentVO findCourseContentByCourseId(Integer courseId);
}
