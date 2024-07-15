package edu.jsu.service.impl;

import edu.jsu.mapper.CourseMapper;
import edu.jsu.pojo.vo.CourseContentVO;
import edu.jsu.service.CourseLessonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Author: yiwang
 * @Date: 2024/7/15
 */

@Service
@RequiredArgsConstructor
public class CourseLessonServiceImpl implements CourseLessonService {
    private final CourseMapper courseMapper;

    @Override
    public CourseContentVO findCourseContentByCourseId(Integer courseId) {

        return courseMapper.findCourseContentByCourseId(courseId);
    }
}
