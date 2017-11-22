package com.ytl.yshu.exception;
/**
 * Author: HueYoung
 * E-mail: hueyoung@foxmail.com
 * Date: 2017年11月21日
 * <p/>
 * Description : 自定义异常处理类
 */
@SuppressWarnings("serial")
public class ApiException extends Exception {

	public ApiException(String errorMsg) {
		super(errorMsg);
	}
}
