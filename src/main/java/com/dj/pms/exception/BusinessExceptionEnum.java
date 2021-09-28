package com.dj.pms.exception;

import lombok.Getter;

@Getter
public enum BusinessExceptionEnum implements IExceptionEnum {
    /*未知异常*/
    SYSTEM_ERROR(10000, "系统异常");



    BusinessExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;
    private String message;
}