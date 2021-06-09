package com.atguigu.gulimail.member.fegin;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimail-coupon")
public interface CouponFeginService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
