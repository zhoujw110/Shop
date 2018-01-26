package com.zhou.service;

import java.util.List;

import com.zhou.common.pojo.EasyUITreeNode;


public interface ItemCatService {

	List<EasyUITreeNode> getItemCatlist(long parentId);
}
