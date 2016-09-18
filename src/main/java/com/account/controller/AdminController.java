package com.account.controller;

import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.account.model.Admin;
import com.account.service.AdminService;
import com.account.util.CommonUtil;
import com.account.util.EnumUtil;
import com.account.util.StringUtil;
import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;

	@RequestMapping("/login")
	@ResponseBody
	public JSONObject adminLogin(String adminName, String adminPassword) {
		Map admin = null;
		if (StringUtil.isempty(adminName)) {
			return CommonUtil.constructResponse(EnumUtil.REQUERST_INVALID, "用户名为空", null);
		}
		if (StringUtil.isempty(adminPassword)) {
			return CommonUtil.constructResponse(EnumUtil.REQUERST_INVALID, "密码为空", null);
		}
		Map<String, Object> adminInfo = new HashMap<String, Object>();
		adminInfo.put("adminName", adminName);
		adminInfo.put("adminPassword", adminPassword);
		try {
			admin = adminService.adminLogin(adminInfo);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return CommonUtil.constructResponse(EnumUtil.SYSTEM_ERROR, "系统错误", null);
		}
		if (admin == null) {
			return CommonUtil.constructResponse(EnumUtil.REQUERST_INVALID, "用户名或者密码错误", null);
		}
		return CommonUtil.constructResponse(EnumUtil.REQUERST_SUCCESS, "请求成功", admin.get("adminName"));
	}
}
