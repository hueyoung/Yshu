package com.ytl.yshu.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: HueYoung
 * E-mail: hueyoung@foxmail.com
 * Date: 2017年12月1日
 * <p/>
 * Description : 返回视图页面
 */

@Controller
@RequestMapping("act")
public class ViewController {
	
	@RequestMapping(value = "/register")
	public String register() {
		return "registerAct";
	}
}
