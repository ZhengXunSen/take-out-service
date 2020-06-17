package com.dream.takeoutservice.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dream.takeoutservice.entity.CategoryInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bill zheng
 * @since 2020-06-17
 */
public interface CategoryInfoService extends IService<CategoryInfo> {

    /**
     * 获取菜单列表
     * @param pageNum 页码
     * @param pageSize 页数
     * @return 菜单列表信息
     */
    IPage<CategoryInfo> getAllCategory(int pageNum, int pageSize);


}
