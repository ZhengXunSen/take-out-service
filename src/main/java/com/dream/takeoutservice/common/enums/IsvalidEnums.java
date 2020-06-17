package com.dream.takeoutservice.common.enums;

import lombok.Getter;

/**
 * @author bill.zheng created on 2020/6/17 22:53
 */
@Getter
public enum IsvalidEnums {
    //有效
    VALID(1,"有效"),
    INVALID(0,"无效")
    ;
    private Integer code;

    private String desc;

    IsvalidEnums(Integer code, String desc){
        this.code = code;
        this.desc = desc;
    }
}
