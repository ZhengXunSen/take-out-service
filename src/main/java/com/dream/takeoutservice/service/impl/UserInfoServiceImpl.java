package com.dream.takeoutservice.service.impl;

import com.dream.takeoutservice.entity.UserInfo;
import com.dream.takeoutservice.mapper.UserInfoMapper;
import com.dream.takeoutservice.service.UserInfoService;
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
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
