package com.zhou.sso.service;

import com.zhou.common.utils.ShopResult;

/**
 * 根据token查询用户信息
 */
public interface TokenService {

	ShopResult getUserByToken(String token);
}
