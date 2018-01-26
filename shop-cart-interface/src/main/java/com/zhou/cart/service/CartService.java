package com.zhou.cart.service;

import java.util.List;

import com.zhou.common.utils.ShopResult;
import com.zhou.pojo.TbItem;


public interface CartService {

	ShopResult addCart(long userId, long itemId, int num);
	ShopResult mergeCart(long userId, List<TbItem> itemList);
	List<TbItem> getCartList(long userId);
	ShopResult updateCartNum(long userId, long itemId, int num);
	ShopResult deleteCartItem(long userId, long itemId);
	ShopResult clearCartItem(long userId);
}
