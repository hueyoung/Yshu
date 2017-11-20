package com.ytl.yshu.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ytl.yshu.common.model.ReData;
import com.ytl.yshu.dao.YshuUserMapper;
import com.ytl.yshu.dao.po.YshuUser;
import com.ytl.yshu.service.UserService;

/**
 * Author: HueYoung
 * E-mail: hueyoung@foxmail.com
 * Date: 2017年11月17日
 * <p/>
 * Description : 
 */
@Service
public class UserImpl implements UserService {

	@Autowired
	private YshuUserMapper yShuUserMapper;
	
	public ReData<Map<String, Object>> login(int userId, String psw) {
		Map<String, Object> map = new HashMap<String, Object>();
		ReData<Map<String, Object>> reData = new ReData<Map<String, Object>>();
		YshuUser ys = yShuUserMapper.selectByPrimaryKey(userId);
		if (ys != null) {
			reData.setCode(1);
			map.put("user_id", ys.getUserId());
			reData.setData(map);
			reData.setMsg("登录成功！");
		} else {
			reData.setCode(0);
			reData.setMsg("登录失败！");
		}
		return reData;
	}
}
