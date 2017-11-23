package com.ytl.yshu.service;

import java.util.Map;

import com.ytl.yshu.common.model.ReData;
import com.ytl.yshu.common.model.param.RegisterModel;

/**
 * Author: HueYoung
 * E-mail: hueyoung@foxmail.com
 * Date: 2017年11月17日
 * <p/>
 * Description : 用户操作业务
 */
public interface UserService {

	/**
	 * 用户注册
	 * @return
	 */
	public ReData<Map<String, Object>> register(RegisterModel registerModel);
	
	/**
	 * 用户登录
	 * @return
	 */
	public ReData<Map<String, Object>> login(String userId, String psw);
}
