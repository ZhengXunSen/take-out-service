package com.dream.takeoutservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.dream.takeoutservice.entity.GoodsInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author bill zheng
 * @since 2020-06-17
 */
public interface GoodsInfoMapper extends BaseMapper<GoodsInfo> {

    List<GoodsInfo> getGoodsInfoByCategoryId(@Param("page") IPage<GoodsInfo> page,@Param("categoryId") Long categoryId);
}
