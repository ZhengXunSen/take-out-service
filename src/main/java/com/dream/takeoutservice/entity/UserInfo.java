package com.dream.takeoutservice.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author bill zheng
 * @since 2020-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户性别(0-男，1-女)
     */
    private Boolean userSex;

    /**
     * 用户小程序openid
     */
    private String openid;

    /**
     * 手机号码
     */
    private String userPhone;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 是否vip(0-否，1-是)
     */
    private Boolean isVip;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否有效（0-否，1-是）
     */
    private Boolean isValid;


}
