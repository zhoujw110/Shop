package com.zhou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhou.common.utils.ShopResult;
import com.zhou.search.service.SearchItemService;

/**
 * 导入商品数据到索引库
 */
@Controller
public class SearchItemController {
	
	@Autowired
	private SearchItemService searchItemService;

	@RequestMapping("/index/item/import")
	@ResponseBody
	public ShopResult importItemList() {
		ShopResult e3Result = searchItemService.importAllItems();
		return e3Result;
		
	}
}
