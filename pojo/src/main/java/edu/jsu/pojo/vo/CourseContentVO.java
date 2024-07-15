package edu.jsu.pojo.vo;

import edu.jsu.pojo.domain.CourseLesson;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Author: yiwang
 * @Date: 2024/7/15
 */

@Data
public class CourseContentVO {
    private Integer id;
    private Integer courseId;
    private String sectionName;
    private String description;
    private Date createTime;
    private Date updateTime;
    private Integer isDel;
    private Integer orderNum;
    private Integer status;
    private List<CourseLesson> lessonList;
}
