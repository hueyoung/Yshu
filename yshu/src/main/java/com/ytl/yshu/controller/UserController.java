package com.ytl.yshu.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ytl.yshu.common.model.ReData;
import com.ytl.yshu.common.model.param.RegisterModel;
import com.ytl.yshu.service.UserService;

/**
 * Author: HueYoung
 * E-mail: hueyoung@foxmail.com
 * Date: 2017年11月17日
 * <p/>
 * Description : 用户操作
 */

@Controller
@RequestMapping("api/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@ResponseBody
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ReData<Map<String, Object>> register(RegisterModel registerModel) {
		return userService.register(registerModel);
	}

	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ReData<Map<String, Object>> login(int user_id, String psw) {
		return userService.login(user_id, psw);
	}
}
