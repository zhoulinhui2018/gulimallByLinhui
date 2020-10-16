package com.linhui.gulimall.user.controller;

import java.util.Arrays;
import java.util.Map;

import com.linhui.gulimall.user.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.linhui.gulimall.user.entity.MemberEntity;
import com.linhui.gulimall.user.service.MemberService;
import com.linhui.common.utils.PageUtils;
import com.linhui.common.utils.R;



/**
 * 会员
 *
 * @author linhui
 * @email 1047043261@qq.com
 * @date 2020-07-29 20:00:24
 */
@RestController
@RequestMapping("user/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    CouponFeignService couponFeignService;

    @RequestMapping("coupon/list")
    public R userCoupons(){
        R userCoupons = couponFeignService.userCoupons();
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("test");
        return R.ok().put("user",memberEntity).put("coupons",userCoupons.get("coupons"));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
