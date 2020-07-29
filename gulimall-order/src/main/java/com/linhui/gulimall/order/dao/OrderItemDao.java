package com.linhui.gulimall.order.dao;

import com.linhui.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author linhui
 * @email 1047043261@qq.com
 * @date 2020-07-29 19:49:03
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
