package com.zhou.order.service;

import com.zhou.common.utils.ShopResult;
import com.zhou.order.pojo.OrderInfo;

public interface OrderService {

	ShopResult createOrder(OrderInfo orderInfo);
}
