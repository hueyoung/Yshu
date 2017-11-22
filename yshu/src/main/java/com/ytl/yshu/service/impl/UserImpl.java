package com.ytl.yshu.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ytl.yshu.common.model.ReData;
import com.ytl.yshu.common.model.param.RegisterModel;
import com.ytl.yshu.dao.YshuUserMapper;
import com.ytl.yshu.dao.po.YshuUser;
import com.ytl.yshu.service.UserService;
import com.ytl.yshu.service.impl.base.BaseImpl;
import com.ytl.yshu.util.TextUtils;

/**
 * Author: HueYoung
 * E-mail: hueyoung@foxmail.com
 * Date: 2017年11月17日
 * <p/>
 * Description : 
 */
@Service
public class UserImpl extends BaseImpl implements UserService {

	@Autowired
	private YshuUserMapper yShuUserMapper;
	
	/** 用户登录 */
	public ReData<Map<String, Object>> login(int userId, String psw) {
		Map<String, Object> reMap = new HashMap<String, Object>();
		ReData<Map<String, Object>> reData = new ReData<Map<String, Object>>();
		if (userId <= 0) {
			requestFail(reData, "登录失败！", reMap, "用户名无效！");
		} else if (TextUtils.isEmpty(psw)) {
			requestFail(reData, "登录失败！", reMap, "密码不正确！");
		}
		try {
			YshuUser ys = yShuUserMapper.selectByPrimaryKey(userId);
			if (ys != null) {
				reMap.put("userId", ys.getUserId());
				requestSuccess(reData, "登录成功", reMap, null);
			} else {
				requestFail(reData, "登录失败！", reMap, null);
			}
		} catch(Exception e) {
			requestFail(reData, "登录失败！", reMap, e.getMessage());
		}
		return reData;
	}

	/** 用户注册 */
	public ReData<Map<String, Object>> register(RegisterModel registerModel) {
		Map<String, Object> reMap = new HashMap<String, Object>();
		ReData<Map<String, Object>> reData = new ReData<Map<String, Object>>();
		YshuUser ys = new YshuUser();
		ys.setUserId(registerModel.getUserId());
		ys.setPsw(registerModel.getPsw());
		ys.setLoginType(registerModel.getLoginType());
		ys.setLastLogin(registerModel.getLastLogin());
		try {
			int state = yShuUserMapper.insert(ys);
			if (state == 0) {
				requestFail(reData, "注册失败！", reMap, null);
			} else {
				reMap.put("userId", ys.getUserId());
				requestSuccess(reData, "注册成功！", reMap, null);
			}
		} catch(Exception e) {
			requestFail(reData, "注册失败！", reMap, e.getMessage());
		}
		return reData;
	}
}
