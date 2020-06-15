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
public class OrderInfo implements Serializable {

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
     * 订单编号
     */
    private String orderNo;

    /**
     * 订单状态(0-待支付,1-已支付,2-待配送,3-已完成)
     */
    private Integer orderStatus;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户openid
     */
    private String openid;

    /**
     * 用户手机号码
     */
    private String userPhone;

    /**
     * 支付方式（0-支付宝,1-微信，20-其他)
     */
    private Integer payWay;

    /**
     * 配送地址
     */
    private String deliveryAddress;

    /**
     * 配送方式(0-自取,1-外卖)
     */
    private Integer deliveryWay;

    /**
     * 取餐时间
     */
    private String takeFoodTime;

    /**
     * 付款金额
     */
    private String paymentAmount;

    /**
     * 付款币种(0-人民币,1-美元,50-其他）
     */
    private Integer paymentCurrency;

    /**
     * 商家名称
     */
    private String merchantName;

    /**
     * 门店地址
     */
    private String merchantAddress;

    /**
     * 是否有效(0-否,1-是)
     */
    private Boolean isValid;


}
