package com.dream.takeoutservice.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dream.takeoutservice.common.req.CategoryGoodsReq;
import com.dream.takeoutservice.entity.GoodsInfo;
import com.dream.takeoutservice.service.GoodsInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bill.zheng
 * @since 2020-06-17
 */
@Api(tags = "商品接口")
@RestController
@RequestMapping("/api/v1/goods-info")
public class GoodsInfoController {

    @Autowired
    private GoodsInfoService goodsInfoService;

    @ApiOperation("根据菜单id获取菜单下商品信息")
    @PostMapping("getGoodsInfoByCategoryId")
    public IPage<GoodsInfo> getGoodsInfoByCategoryId(@RequestBody CategoryGoodsReq categoryGoodsReq){
        return goodsInfoService.getGoodsInfoByCategoryId(categoryGoodsReq);
    }
}

