package com.zzk1102156537.tilaswebmanagement.pojo;

import lombok.Data;
import org.jspecify.annotations.NonNull;

import javax.management.modelmbean.InvalidTargetObjectTypeException;

//该类用于返回结果
@Data
public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public static @NonNull Result success(){
        Result result = new Result();
        result.code=1;
        result.msg="success";
        return result;
    }
    public static Result success(Object object){
        Result result=new Result();
        result.data = object;
        result.code = 1;
        result.msg = "success";
        return result;
    }

    public static Result error(String msg){
        Result result = new Result();
        result.msg = msg;
        result.code = 0;
        return result;
    }
}
