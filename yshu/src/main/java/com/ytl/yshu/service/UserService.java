package com.ytl.yshu.service;

import java.util.Map;

import com.ytl.yshu.common.model.ReData;

/**
 * Author: HueYoung
 * E-mail: hueyoung@foxmail.com
 * Date: 2017年11月17日
 * <p/>
 * Description : 用户操作业务
 */
public interface UserService {

	/**
	 * 用户登录
	 * @return
	 */
	public ReData<Map<String, Object>> login(int userId, String psw);
}
