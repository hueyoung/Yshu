package com.ytl.yshu.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	/**
	 * 判断字符是否正确密码
	 * @param str
	 * @return
	 * 返回true表示字符长度大于3
	 * 返回false表示非法密码
	 */
	public static boolean isErrorPsw(String psw) {
		if (isEmpty(psw) || psw.length() < 3) {
			return true;
		} 
		return false;
	}
	
	/*
	 * 电信
	 * 中国电信手机号码开头数字
	 * 2G/3G号段（CDMA2000网络）133、153、180、181、189
	 * 4G号段 177
	 *
	 * 联通
	 * 中国联通手机号码开头数字
	 * 2G号段（GSM网络）130、131、132、155、156
	 * 3G上网卡145
	 * 3G号段（WCDMA网络）185、186
	 * 4G号段 176、185[1]
	 *
	 * 移动
	 * 中国移动手机号码开头数字
	 * 2G号段（GSM网络）有134x（0-8）、135、136、137、138、139、150、151、152、158、159、182、183、184。
	 * 3G号段（TD-SCDMA网络）有157、187、188
	 * 3G上网卡 147
	 * 4G号段 178
	 * 补充
	 *
	 * 14号段以前为上网卡专属号段，如中国联通的是145，中国移动的是147等等。
	 * 170号段为虚拟运营商专属号段，170号段的 11 位手机号前四位来区分基础运营商，其中 “1700” 为中国电信的转售号码标识，“1705” 为中国移动，“1709” 为中国联通。
	 */
	public static boolean isMobileNO(String mobiles) {
        // Pattern p = Pattern.compile("^((1[3,5,8][0-9])|(14[5,7])|(17[0,6,7,8]))\\d{8}$");
        Pattern regex   = Pattern.compile("^((1[358][0-9])|(14[57])|(17[0678]))\\d{8}$");
        Matcher matcher = regex.matcher(mobiles);
        return matcher.matches();
    }
}
