package com.linhui.gulimall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.linhui.common.utils.PageUtils;
import com.linhui.gulimall.user.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author linhui
 * @email 1047043261@qq.com
 * @date 2020-07-29 20:00:23
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

