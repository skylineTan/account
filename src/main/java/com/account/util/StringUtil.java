package com.account.util;

/**
 * �����һ�� String �Ĺ�����
 * 
 * @author Administrator
 *
 */
public class StringUtil {
	/**
	 * �ж� �ַ��� �Ƿ�Ϊ��
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
