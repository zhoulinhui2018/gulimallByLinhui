package com.linhui.gulimall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.linhui.common.utils.PageUtils;
import com.linhui.gulimall.user.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author linhui
 * @email 1047043261@qq.com
 * @date 2020-07-29 20:00:24
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

