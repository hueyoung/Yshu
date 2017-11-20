package com.ytl.yshu.common.model;
/**
 * Author: HueYoung
 * E-mail: hueyoung@foxmail.com
 * Date: 2017年11月17日
 * <p/>
 * Description : 返回json对象
 * @param <T>
 */
public class ReData<T> {

	/** 状态码 */
	private int code;
	/** 数据 */
	private T data;
	/** 描述信息 */
	private String msg;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
