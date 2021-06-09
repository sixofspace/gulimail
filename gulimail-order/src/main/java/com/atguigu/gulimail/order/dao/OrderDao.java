package com.atguigu.gulimail.order.dao;

import com.atguigu.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author huweikang
 * @email 820614752@qq.com
 * @date 2021-06-08 10:10:19
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
