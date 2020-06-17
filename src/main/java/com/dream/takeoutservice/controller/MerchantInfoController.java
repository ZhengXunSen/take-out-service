package com.dream.takeoutservice.controller;


import com.dream.takeoutservice.entity.MerchantInfo;
import com.dream.takeoutservice.service.MerchantInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author bill zheng
 * @since 2020-06-17
 */
@Api(tags = "商户相关信息接口")
@RestController
@RequestMapping("/merchant-info")
public class MerchantInfoController {

    @Autowired
    private MerchantInfoService merchantInfoService;

    @ApiOperation("获取门店信息接口")
    @GetMapping("getMechantInfo")
    public MerchantInfo getMerchantInfo(){
        return merchantInfoService.getById(1);
    }
}

