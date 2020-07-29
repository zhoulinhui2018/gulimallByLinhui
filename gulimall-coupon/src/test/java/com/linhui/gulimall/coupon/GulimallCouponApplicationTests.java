package com.linhui.gulimall.coupon;

import com.linhui.gulimall.coupon.entity.CouponEntity;
import com.linhui.gulimall.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallCouponApplicationTests {
    @Autowired
    CouponService couponService;

    @Test
    void testCouponService(){
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("testName");
        couponService.save(couponEntity);
        System.out.println("保存成功");
    }


    @Test
    void contextLoads() {
    }

}
