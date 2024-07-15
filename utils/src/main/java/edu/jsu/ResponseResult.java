package edu.jsu;

import com.alibaba.fastjson2.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: yiwang
 * @Date: 2024/7/12
 */
@ToString
@AllArgsConstructor
@Data
@NoArgsConstructor
public class ResponseResult {
    private int code;
    private String msg;
    private Object data;
    public static ResponseResult success() {
        return new ResponseResult(200, "success", null);
    }


    public static ResponseResult success(Object data) {
        return  new ResponseResult(200, "success", data);
    }
    public static ResponseResult error(int code, String msg) {
        return new ResponseResult(code, msg, null);
    }
    public static ResponseResult error(String msg) {
        return new ResponseResult(500, msg, null) ;
    }




}
