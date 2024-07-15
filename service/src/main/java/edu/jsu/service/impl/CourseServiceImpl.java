package edu.jsu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.jsu.mapper.CourseMapper;
import edu.jsu.mapper.TeacherMapper;
import edu.jsu.pojo.domain.Course;
import edu.jsu.pojo.domain.Teacher;
import edu.jsu.pojo.query.CourseQuery;
import edu.jsu.pojo.vo.CourseVO;
import edu.jsu.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.Date;
import java.util.List;

/**
 * @Author: yiwang
 * @Date: 2024/7/13
 */
@RequiredArgsConstructor
@Service
public class CourseServiceImpl implements CourseService {

    private final CourseMapper courseMapper;
    private final TeacherMapper teacherMapper;

    @Override
    public PageInfo<Course> findAllCourseByPage(CourseQuery courseQuery) {
        if (courseQuery.getCurrPage() == null ){
            courseQuery.setCurrPage(1);
        }
        if (courseQuery.getPageSize() == null ){
            courseQuery.setPageSize(10);
        }
        PageHelper.startPage(courseQuery.getCurrPage(), courseQuery.getPageSize());
        List<Course> allCourseByPage = courseMapper.findAllCourseByPage(courseQuery);

        return new PageInfo<>(allCourseByPage);
    }

    @Override
    public int addCourse(Course course) {
        return courseMapper.insert(course);
    }

    @Transactional
    @Override
    public int addOrUpdateCourseByCourseVO(CourseVO courseVO) {
        Integer id = courseVO.getId();

        //课程信息
        Course course = new Course();
        BeanUtils.copyProperties(courseVO,course);
        course.setStatus(1);
        course.setIsDel(0);
        course.setCreateTime(new Date());
        course.setUpdateTime(new Date());

        //教师信息
        Teacher teacher = new Teacher();
        BeanUtils.copyProperties(courseVO,teacher);
        teacher.setIsDel(0);
        teacher.setCreateTime(new Date());
        teacher.setUpdateTime(new Date());

        //如果id为空，则新增课程
        if(ObjectUtils.isEmpty(id)){
            int courseId = courseMapper.insert(course);
            if(ObjectUtils.isEmpty(teacherMapper.findTeacherByTeacherName(teacher.getTeacherName()))){
                teacher.setCourseId(courseId);
                return  teacherMapper.insert(teacher);
            }
            return 0;
        }else {//不然更新课程
            int i = teacherMapper.updateByPrimaryKeySelective(teacher);
            i+=courseMapper.updateByPrimaryKeySelective(course);
            return i;
        }
    }

    @Override
    public Course findByCourseId(Integer id) {
        return courseMapper.findByCourseId(id);
    }

    @Override
    public int updateStatus(Integer id, Integer status) {
        int i = courseMapper.updateStatus(id, status);
        if(i!=0){
            return status;
        }
        return -1;
    }

//    @Override
//    public void saveCourseOrTeacher(CourseVO courseVO) {
//
//        //封装课程信息
//        Course course = new Course();
//
//        BeanUtils.copyProperties(courseVO,course);
//
//        //补全课程信息
//        Date date = new Date();
//        course.setCreateTime(date);
//        course.setUpdateTime(date);
//
//        //保存课程信息
//        courseMapper.insert(course);
//
//        //获取新插入数据的id值
//        int id = course.getId();
//
//        //封装讲师信息
//        Teacher teacher = new Teacher();
//        BeanUtils.copyProperties(courseVO,teacher);
//
//        //补全讲师信息
//        teacher.setCreateTime(date);
//        teacher.setUpdateTime(date);
//        teacher.setIsDel(0);
//        teacher.setCourseId(id);
//
//        //保存讲师信息
//        teacherMapper.insert(teacher);
//
//    }


}
