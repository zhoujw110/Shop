package com.zhou.sso.service;

import com.zhou.common.utils.ShopResult;

public interface LoginService {

	//参数：用户名和密码
	//业务逻辑：
	/*
	 * 1、判断用户和密码是否正确
	 * 2、如果不正确，返回登录失败
	 * 3、如果正确生成token。
	 * 4、把用户信息写入redis，key：token value：用户信息
	 * 5、设置Session的过期时间
	 * 6、把token返回
	 */
	//返回值：ShopResult，其中包含token信息
	ShopResult userLogin(String username, String password);
}
