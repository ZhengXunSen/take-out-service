package com.dream.takeoutservice.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dream.takeoutservice.common.req.CategoryGoodsReq;
import com.dream.takeoutservice.entity.GoodsInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author bill zheng
 * @since 2020-06-17
 */
public interface GoodsInfoService extends IService<GoodsInfo> {

    /**
     * 根据菜单id获取对应的货物信息
     * @param categoryGoodsReq 菜单id及分页信息
     * @return 货物信息列表
     */
    IPage<GoodsInfo> getGoodsInfoByCategoryId(CategoryGoodsReq categoryGoodsReq);
}
