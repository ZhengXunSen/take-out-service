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
public class CategoryInfo implements Serializable {

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
     * 种类名称
     */
    private String categoryName;

    /**
     * 种类描述
     */
    private String categoryDesc;

    /**
     * 是否有效(0-否,1-是)
     */
    private Boolean isValid;


}
