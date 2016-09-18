package com.account.util;

/**
 * 定义的一个 String 的工具类
 * 
 * @author Administrator
 *
 */
public class StringUtil {
	/**
	 * 判断 字符串 是否为空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isempty(String str) {
		if (str == null || "".equals(str.trim())) {
			return true;
		}
		return false;
	}
}
