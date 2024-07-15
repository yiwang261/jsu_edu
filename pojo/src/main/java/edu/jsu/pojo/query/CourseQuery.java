package edu.jsu.pojo.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: yiwang
 * @Date: 2024/7/13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseQuery {
    private String courseName;
    private Integer status;
    private Integer currPage;
    private Integer pageSize;
}
