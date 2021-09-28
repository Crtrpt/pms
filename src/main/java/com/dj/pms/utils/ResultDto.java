package com.dj.pms.utils;

import lombok.Data;

@Data
public class ResultDto<T> {

    int code = -1;

    String msg = "";

    T Data;

    public ResultDto(int code, T res) {
        this.code = code;
        this.setData(res);
    }

    public static <T> ResultDto<T> OK(T s) {
        return new ResultDto<>(0, s);
    }

    public static  <T> ResultDto<T>  Error(T s) {
        return new ResultDto<>(1, s);
    }
    public static  <T> ResultDto<T>  Error(int code, T s) {
        return new ResultDto<>(code, s);
    }
}