package com.dream.takeoutservice.common.exception;


import com.dream.takeoutservice.common.constant.ExceptionEnum;

/**
 * 可枚举异常
 */
public class ZxsEnumRuntimeException extends RuntimeException {
    private final int errorCode;

    public ZxsEnumRuntimeException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getErrorMessage());
        this.errorCode = exceptionEnum.getErrorCode();
    }

    public int getErrorCode() {
        return errorCode;
    }
}
