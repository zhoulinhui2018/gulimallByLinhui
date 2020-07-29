package com.linhui.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.linhui.common.utils.PageUtils;
import com.linhui.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author linhui
 * @email 1047043261@qq.com
 * @date 2020-07-29 17:29:29
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

