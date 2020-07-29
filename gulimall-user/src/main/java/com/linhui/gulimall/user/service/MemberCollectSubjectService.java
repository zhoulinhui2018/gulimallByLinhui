package com.linhui.gulimall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.linhui.common.utils.PageUtils;
import com.linhui.gulimall.user.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author linhui
 * @email 1047043261@qq.com
 * @date 2020-07-29 20:00:23
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

