package com.ytl.yshu.util;
/**
 * Author: HueYoung
 * E-mail: hueyoung@foxmail.com
 * Date: 2017年11月22日
 * <p/>
 * Description : 文本处理
 */
public class TextUtils {

	/**
	 * 判断字符是否为null或者为空字符串
	 * @param str
	 * @return
	 * 返回true表示为null或者为空字符串
	 * 返回false表示不为null或者空字符串
	 */
	public static boolean isEmpty(String str) {
		if (null != str && str.length() > 0) {
			return false;
		}
		return true;
	}
}
