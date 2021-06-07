package com.atguigu.gulimail.product.dao;

import com.atguigu.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author huweikang
 * @email 820614752@qq.com
 * @date 2021-06-07 11:07:10
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
