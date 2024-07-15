package edu.jsu.web;

import com.github.pagehelper.PageInfo;
import edu.jsu.ResponseResult;
import edu.jsu.pojo.domain.Course;
import edu.jsu.pojo.query.CourseQuery;
import edu.jsu.pojo.vo.CourseVO;
import edu.jsu.service.CourseService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Author: yiwang
 * @Date: 2024/7/13
 */

@RestController
@RequestMapping(value ="/course")
@RequiredArgsConstructor
public class CourseController {

    private static final Log log = LogFactory.getLog(CourseController.class);
    final private CourseService courseService;
    @GetMapping
    public ResponseResult findAllCourse(CourseQuery courseQuery){
        log.info("findAllCourse");
        PageInfo<Course> page = courseService.findAllCourseByPage(courseQuery);
        return ResponseResult.success(page);
    }

    @PostMapping("/courseUpload")
    public ResponseResult courseUpload(@RequestParam("file")MultipartFile multipartFile
            , HttpServletRequest request){

        if (multipartFile.isEmpty()) {
           throw  new RuntimeException("文件为空");
        }
//        String path = CourseController.class.getClassLoader().getResource("").getPath();
//        String realPath = path.substring(0, path.lastIndexOf("WEB-INF"));
        //获取项目根目录
        String realPath = request.getServletContext().getRealPath("/");
        System.out.println(realPath);
        String fileFilePath = realPath + "upload";



        String newName = getNewName(multipartFile.getOriginalFilename());

        File newFile = new File(new File(fileFilePath), newName);
        if (!newFile.getParentFile().exists()) {
            newFile.getParentFile().mkdirs();
        }
        try {
            multipartFile.transferTo(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String,String> map = new HashMap<>();
        map.put("fileName",newName);
        map.put("filePath","http://localhost:8080/jsu/upload/"+newName);

        return ResponseResult.success(map);
    }


    @PostMapping("/saveOrUpdateCourse")
    public ResponseResult addCourse(@RequestBody CourseVO courseVO){
        return courseService.addOrUpdateCourseByCourseVO(courseVO)==1?
                ResponseResult.success():
                ResponseResult.error("添加失败");
    }


    @GetMapping("/{id}")
    public ResponseResult findByCourseId(@PathVariable("id") Integer id){
        return ResponseResult.success(courseService.findByCourseId(id));
    }


    @GetMapping("/updateCourseStatus")
    public ResponseResult updateCourseStatus(@RequestParam("id") Integer id,
                                             @RequestParam("status") Integer status){

        return ResponseResult.success(Map.of("status",courseService.updateStatus(id, status)));
    }


    public static String getNewName(String fileName) {
        String substring = fileName.substring(fileName.lastIndexOf('.'));
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid + substring;
    }
}
