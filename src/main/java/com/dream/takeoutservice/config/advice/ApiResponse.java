package com.dream.takeoutservice.config.advice;

import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * API调用的通用结果
 *
 * @author roman.luo
 * @date 2017/7/18
 */
@Data
public class ApiResponse<T> {

    private int code;

    private String message;

    private T data;

    private ApiResponse() {
        this(null);
    }

    private ApiResponse(T data) {
        this(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), data);
    }

    private ApiResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ApiResponse<Object> success(Object data) {
        return new ApiResponse<>(data);
    }

    public static ApiResponse<Object> failure(String message) {
        return failure(HttpStatus.INTERNAL_SERVER_ERROR.value(), message);
    }

    public static ApiResponse<Object> failure(int statusCode, String message) {
        return new ApiResponse<>(statusCode, message, null);
    }
}
