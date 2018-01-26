package com.zhou.search.mapper;

import java.util.List;

import com.zhou.common.pojo.SearchItem;

public interface ItemMapper {

	List<SearchItem> getItemList();
	SearchItem getItemById(long itemId);
}
