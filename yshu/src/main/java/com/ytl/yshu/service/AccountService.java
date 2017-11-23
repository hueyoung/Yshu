package com.ytl.yshu.service;

import java.util.Map;

import com.ytl.yshu.common.model.ReData;
import com.ytl.yshu.common.model.param.UpdateContentModel;

/**
 * Author: HueYoung
 * E-mail: hueyoung@foxmail.com
 * Date: 2017年11月22日
 * <p/>
 * Description : 账户相关业务 
 */
public interface AccountService {

	/**
	 * 更新遗书内容
	 * @return
	 */
	public ReData<Map<String, Object>> updateContent(UpdateContentModel updateContentModel);
}
