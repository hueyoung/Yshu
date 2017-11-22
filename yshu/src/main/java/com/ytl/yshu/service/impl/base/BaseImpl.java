package com.ytl.yshu.service.impl.base;

import java.util.Map;

import com.ytl.yshu.common.Constant;
import com.ytl.yshu.common.model.ReData;
import com.ytl.yshu.util.TextUtils;

/**
 * Author: HueYoung
 * E-mail: hueyoung@foxmail.com
 * Date: 2017年11月22日
 * <p/>
 * Description : 基类
 */
public class BaseImpl {

	/**
	 * 请求错误返回封装 
	 * @param reData 
	 * 			外层包体
	 * @param hashMap
	 * 			返回参数
	 * @param errorMsg
	 * 			错误描述
	 */
	public void requestFail(ReData<Map<String, Object>> reData, String msg, Map<String, Object> reMap, String errorMsg) {
		reData.setCode(Constant.ERROR_CODE);
		reData.setMsg(msg);
		if (!TextUtils.isEmpty(errorMsg)) {
			reMap.put(Constant.ERROR_MSG, errorMsg);
		}
		reData.setData(reMap);
	}
	
	/**
	 * 请求成功返回封装 
	 * @param reData 
	 * 			外层包体
	 * @param hashMap
	 * 			返回参数
	 * @param errorMsg
	 * 			错误描述
	 */
	public void requestSuccess(ReData<Map<String, Object>> reData, String msg, Map<String, Object> reMap, String errorMsg) {
		reData.setCode(Constant.SUCCESS_CODE);
		reData.setMsg(msg);
		if (!TextUtils.isEmpty(errorMsg)) {
			reMap.put(Constant.ERROR_MSG, errorMsg);
		}
		reData.setData(reMap);
	}
}
