package com.zhou.content.service;

import java.util.List;

import com.zhou.common.pojo.EasyUITreeNode;
import com.zhou.common.utils.ShopResult;

public interface ContentCategoryService {

	List<EasyUITreeNode> getContentCatList(long parentId);
	ShopResult addContentCategory(long parentId, String name);
}
