package com.dream.takeoutservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dream.takeoutservice.entity.CategoryInfo;
import com.dream.takeoutservice.mapper.CategoryInfoMapper;
import com.dream.takeoutservice.service.CategoryInfoService;
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
public class CategoryInfoServiceImpl extends ServiceImpl<CategoryInfoMapper, CategoryInfo> implements CategoryInfoService {


    @Override
    public IPage<CategoryInfo> getAllCategory(int pageNum, int pageSize) {
        Page<CategoryInfo> page = new Page<>(pageNum, pageSize);
        return baseMapper.selectPage(page,new LambdaQueryWrapper<CategoryInfo>().eq(CategoryInfo::getIsValid, true));
    }


}
