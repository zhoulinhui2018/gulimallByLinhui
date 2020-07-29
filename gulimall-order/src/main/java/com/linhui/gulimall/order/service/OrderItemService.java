package com.linhui.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.linhui.common.utils.PageUtils;
import com.linhui.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author linhui
 * @email 1047043261@qq.com
 * @date 2020-07-29 19:49:03
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

