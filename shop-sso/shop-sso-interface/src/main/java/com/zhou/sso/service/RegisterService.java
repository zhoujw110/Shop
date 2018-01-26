package com.zhou.sso.service;

import com.zhou.common.utils.ShopResult;
import com.zhou.pojo.TbUser;

public interface RegisterService {

	ShopResult checkData(String param, int type);
	ShopResult register(TbUser user);
}
