package com.linhui.gulimall.product.dao;

import com.linhui.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author linhui
 * @email 1047043261@qq.com
 * @date 2020-07-29 17:29:29
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
