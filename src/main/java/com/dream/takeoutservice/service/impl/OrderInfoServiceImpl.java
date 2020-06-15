package com.dream.takeoutservice.service.impl;

import com.dream.takeoutservice.entity.OrderInfo;
import com.dream.takeoutservice.mapper.OrderInfoMapper;
import com.dream.takeoutservice.service.OrderInfoService;
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
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

}
