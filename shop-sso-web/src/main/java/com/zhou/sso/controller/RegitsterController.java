package com.zhou.sso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhou.common.utils.ShopResult;
import com.zhou.pojo.TbUser;
import com.zhou.sso.service.RegisterService;

/**
 * 注册功能Controller
 */
@Controller
public class RegitsterController {
	
	@Autowired
	private RegisterService registerService;

	@RequestMapping("/page/register")
	public String showRegister() {
		return "register";
	}
	
	@RequestMapping("/user/check/{param}/{type}")
	@ResponseBody
	public ShopResult checkData(@PathVariable String param, @PathVariable Integer type) {
		ShopResult e3Result = registerService.checkData(param, type);
		return e3Result;
	}
	
	@RequestMapping(value="/user/register", method=RequestMethod.POST)
	@ResponseBody
	public ShopResult register(TbUser user) {
		ShopResult e3Result = registerService.register(user);
		return e3Result;
	}
	
}
