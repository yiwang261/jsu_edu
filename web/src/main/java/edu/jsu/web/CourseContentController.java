package edu.jsu.web;

import edu.jsu.ResponseResult;
import edu.jsu.service.CourseLessonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yiwang
 * @Date: 2024/7/15
 */

@RestController
@RequestMapping("/courseContent")
@RequiredArgsConstructor
public class CourseContentController {
    private final CourseLessonService courseLessonService;


    @GetMapping("/{id}")
    public ResponseResult findCourseContentByCourseId(@PathVariable("id") Integer courseId) {
//        System.out.println(courseLessonService.findCourseContentByCourseId(courseId));
        return ResponseResult.success(courseLessonService.findCourseContentByCourseId(courseId));
    }
}
