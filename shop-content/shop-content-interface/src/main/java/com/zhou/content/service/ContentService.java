package com.zhou.content.service;

import java.util.List;

import com.zhou.common.utils.ShopResult;
import com.zhou.pojo.TbContent;


public interface ContentService {

	ShopResult addContent(TbContent content);
	List<TbContent> getContentListByCid(long cid);
}
