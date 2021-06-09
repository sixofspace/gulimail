package com.atguigu.gulimail.member.dao;

import com.atguigu.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author huweikang
 * @email 820614752@qq.com
 * @date 2021-06-08 09:55:31
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
