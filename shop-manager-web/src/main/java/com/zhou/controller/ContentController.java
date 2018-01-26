package com.zhou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhou.common.utils.ShopResult;
import com.zhou.content.service.ContentService;
import com.zhou.pojo.TbContent;


/**
 * 内容管理Controller
 */
@Controller
public class ContentController {
	
	@Autowired
	private ContentService contentService;

	@RequestMapping(value="/content/save", method=RequestMethod.POST)
	@ResponseBody
	public ShopResult addContent(TbContent content) {
		//调用服务把内容数据保存到数据库
		ShopResult e3Result = contentService.addContent(content);
		return e3Result;
	}
}
