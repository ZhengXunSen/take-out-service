package com.dream.takeoutservice.common.constant;

public enum ExceptionEnum {
    //基本错误
    RATE_TEMPLATE_ERROR(1000, "一种错误"),
    ;

    private int errorCode;
    private String errorMessage;

    ExceptionEnum(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
