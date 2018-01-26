package com.zhou.service;

import com.zhou.common.pojo.EasyUIDataGridResult;
import com.zhou.common.utils.ShopResult;
import com.zhou.pojo.TbItem;
import com.zhou.pojo.TbItemDesc;

public interface ItemService {

	TbItem getItemById(long itemId);
	EasyUIDataGridResult getItemList(int page, int rows);
	ShopResult addItem(TbItem item, String desc);
	TbItemDesc getItemDescById(long itemId);
}
