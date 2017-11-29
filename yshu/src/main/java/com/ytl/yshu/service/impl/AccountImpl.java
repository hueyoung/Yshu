package com.ytl.yshu.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ytl.yshu.common.model.ReData;
import com.ytl.yshu.common.model.param.UpdateContentModel;
import com.ytl.yshu.dao.YshuTaskMapper;
import com.ytl.yshu.dao.YshuUserMapper;
import com.ytl.yshu.dao.po.YshuTask;
import com.ytl.yshu.dao.po.YshuUser;
import com.ytl.yshu.service.AccountService;
import com.ytl.yshu.service.impl.base.BaseImpl;
import com.ytl.yshu.util.TextUtils;

/**
 * Author: HueYoung
 * E-mail: hueyoung@foxmail.com
 * Date: 2017年11月22日
 * <p/>
 * Description : 账户相关业务类
 */
@Service
public class AccountImpl extends BaseImpl implements AccountService {
	
	@Autowired
	YshuTaskMapper yshuTaskMapper;
	
	@Autowired
	YshuUserMapper yshuUserMapper;
	
	public ReData<Map<String, Object>> updateContent(UpdateContentModel updateContentModel) {
		
		Map<String, Object> reMap = new HashMap<String, Object>();
		ReData<Map<String, Object>> reData = new ReData<Map<String, Object>>();
		try {
			if (updateContentModel == null || !TextUtils.isMobileNO(updateContentModel.getUserId())) {
				requestFail(reData, "发送失败！", reMap, "不是有效用户，请重新登录！");
			} else if (TextUtils.isErrorPsw(updateContentModel.getPsw())) {
				requestFail(reData, "发送失败！", reMap, "不是有效密码，请重新登录！");
			} else if (TextUtils.isEmpty(updateContentModel.getContent())) {
				requestFail(reData, "发送失败！", reMap, "内容不能为空！");
			} else if (!TextUtils.isMobileNO(updateContentModel.getSendPhone())) {
				requestFail(reData, "发送失败！", reMap, "不是有效手机号码！");
			} else {
				YshuUser ys = yshuUserMapper.selectByPrimaryKey(updateContentModel.getUserId());
				// 身份验证
				if (ys != null && updateContentModel.getPsw().equals(ys.getPsw())) {
					YshuTask yt = new YshuTask();
					yt.setUserId(updateContentModel.getUserId());
					yt.setContent(updateContentModel.getContent());
					yt.setSendPhone(updateContentModel.getSendPhone());
					yt.setSendTime(System.currentTimeMillis());
					int isUpdateSuccess = yshuTaskMapper.replace(yt);
					if (isUpdateSuccess > 0) {
						requestSuccess(reData, "发送成功！", reMap, null);
					} else if (isUpdateSuccess == 0){
						requestFail(reData, "发送失败！", reMap, "发送失败,请联系管理员！");
					}
				} else {
					requestFail(reData, "发送失败！", reMap, "身份验证失败，请重新登录！");
				}
			}
		} catch(Exception e) {
			requestFail(reData, "操作失败！", reMap, "请联系管理员！");
		}
		return reData;
	}
}
