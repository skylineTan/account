package com.account.util;

import com.alibaba.fastjson.JSONObject;

/**
 * 定义一些 常见的 工具类
 * 
 * @author Administrator
 *
 */
public class CommonUtil {
	/**
	 * 定义返回json的格式
	 * @param code
	 * @param msg
	 * @param data
	 * @return
	 */
	public static JSONObject constructResponse(int code, String msg, Object data) {
		JSONObject jb = new JSONObject();
		jb.put("code", code);
		jb.put("msg", msg);
		jb.put("data", data);
		return jb;
	}
}
