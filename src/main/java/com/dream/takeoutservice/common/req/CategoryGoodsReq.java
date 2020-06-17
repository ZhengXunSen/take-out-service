package com.dream.takeoutservice.common.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author bill.zheng created on 2020/6/17 22:33
 */
@ApiModel("菜单商品请求参数")
@Data
public class CategoryGoodsReq {

    @ApiModelProperty("菜单id")
    private Long categoryId;

    @ApiModelProperty("页码")
    private Integer pageNum;

    @ApiModelProperty("页数")
    private Integer pageSize;
}
