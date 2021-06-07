package com.atguigu.gulimail.coupon.dao;

import com.atguigu.gulimail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author huweikang
 * @email 820614752@qq.com
 * @date 2021-06-07 14:33:33
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
