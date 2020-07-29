package com.linhui.gulimall.user;

import com.linhui.gulimall.user.entity.MemberEntity;
import com.linhui.gulimall.user.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallUserApplicationTests {
    @Autowired
    MemberService memberService;

    @Test
    void testMenmberService(){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setCity("重庆");
        memberService.save(memberEntity);
        System.out.println("保存成功");
    }

    @Test
    void contextLoads() {
    }

}
