package com.dream.takeoutservice.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dream.takeoutservice.entity.CategoryInfo;
import com.dream.takeoutservice.service.CategoryInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
@Api(tags = "菜单分类接口")
@RestController
@RequestMapping("/api/v1/category-info")
public class CategoryInfoController {

    @Autowired
    private CategoryInfoService categoryInfoService;

    @ApiOperation("获取菜单信息接口")
    @GetMapping("getAllCategory")
    public IPage<CategoryInfo> getAllCategory(@ApiParam(name="pageNum",value = "页码") int pageNum, @ApiParam(name="pageSize",value = "页数")int pageSize){
        return categoryInfoService.getAllCategory(pageNum, pageSize);
    }
}

