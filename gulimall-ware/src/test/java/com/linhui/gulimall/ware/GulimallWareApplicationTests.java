package com.linhui.gulimall.ware;

import com.linhui.gulimall.ware.entity.WareInfoEntity;
import com.linhui.gulimall.ware.service.WareInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallWareApplicationTests {

    @Autowired
    WareInfoService wareInfoService;

    @Test
    void testWareInfoService(){
        WareInfoEntity wareInfoEntity = new WareInfoEntity();
        wareInfoEntity.setName("test");
        wareInfoService.save(wareInfoEntity);
        System.out.println("保存成功");
    }

    @Test
    void contextLoads() {
    }

}
