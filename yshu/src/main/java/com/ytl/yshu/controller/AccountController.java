package com.ytl.yshu.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ytl.yshu.common.model.ReData;
import com.ytl.yshu.common.model.param.UpdateContentModel;
import com.ytl.yshu.service.AccountService;

/**
 * Author: HueYoung
 * E-mail: hueyoung@foxmail.com
 * Date: 2017年11月22日
 * <p/>
 * Description : 账户相关
 */
@Controller
@RequestMapping("api/act")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@ResponseBody
	@RequestMapping(value = "/updateContent", method = RequestMethod.GET)
	public ReData<Map<String, Object>> updateContent(UpdateContentModel updateContentModel) {
		return accountService.updateContent(updateContentModel);
	}
}
