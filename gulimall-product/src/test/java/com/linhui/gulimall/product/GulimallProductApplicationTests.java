package com.linhui.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linhui.gulimall.product.entity.BrandEntity;
import com.linhui.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void testBrand(){
        BrandEntity brandEntity=new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setBrandId(1L);
        brandEntity.setLogo("logo");
        brandService.updateById(brandEntity);
        System.out.println("更新成功");
    }

    @Test
    void testSelect(){
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>());
        list.forEach(System.out::println);
    }

    @Test
    void contextLoads() {
    }

}
