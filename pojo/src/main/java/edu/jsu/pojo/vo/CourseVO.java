package edu.jsu.pojo.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: yiwang
 * @Date: 2024/7/15
 */

@Data
public class CourseVO {
    private Integer id;
    private String courseName;
    private String brief;
    private String teacherName;
    private String description;
    private String position;
    private String previewFirstField;
    private String previewSecondField;
    private BigDecimal discounts;
    private BigDecimal price;
    private String discountsTag;
    private String courseImgUrl;
    private String courseListImg;
    private Integer sortNum;
    private String course_description_mark_down;
    private Integer sales;
}
