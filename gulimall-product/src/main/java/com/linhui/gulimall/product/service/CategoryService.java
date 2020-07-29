package com.linhui.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.linhui.common.utils.PageUtils;
import com.linhui.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author linhui
 * @email 1047043261@qq.com
 * @date 2020-07-29 17:29:29
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

