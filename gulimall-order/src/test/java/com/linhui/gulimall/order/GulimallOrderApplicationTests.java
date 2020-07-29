package com.linhui.gulimall.order;

import com.linhui.gulimall.order.entity.OrderEntity;
import com.linhui.gulimall.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class GulimallOrderApplicationTests {

    @Autowired
    OrderService orderService;

    @Test
    void testOrderService(){
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setPaymentTime(new Date());
        orderService.save(orderEntity);
        System.out.println("保存成功");
    }

    @Test
    void contextLoads() {
    }

}
