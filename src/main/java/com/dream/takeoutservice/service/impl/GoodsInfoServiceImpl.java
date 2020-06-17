package com.dream.takeoutservice.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dream.takeoutservice.common.req.CategoryGoodsReq;
import com.dream.takeoutservice.entity.GoodsInfo;
import com.dream.takeoutservice.mapper.GoodsInfoMapper;
import com.dream.takeoutservice.service.GoodsInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bill zheng
 * @since 2020-06-17
 */
@Service
public class GoodsInfoServiceImpl extends ServiceImpl<GoodsInfoMapper, GoodsInfo> implements GoodsInfoService {

    @Override
    public IPage<GoodsInfo> getGoodsInfoByCategoryId(CategoryGoodsReq categoryGoodsReq) {
        Page<GoodsInfo> page = new Page<>(categoryGoodsReq.getPageNum(), categoryGoodsReq.getPageSize());
        page.setRecords(baseMapper.getGoodsInfoByCategoryId(page, categoryGoodsReq.getCategoryId()));
        return page;
    }
}
