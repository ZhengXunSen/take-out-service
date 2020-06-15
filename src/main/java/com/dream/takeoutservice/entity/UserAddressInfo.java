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
public class UserAddressInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户地址
     */
    private String userAddress;

    /**
     * 是否默认地址(0-否,1-是)
     */
    private Boolean isDefault;

    /**
     * 是否有效(0-否,1-是)
     */
    private Boolean isValid;


}
