package com.account.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.dao.AdminDao;
import com.account.model.Admin;
import com.account.service.AdminService;
@Service("adminService")
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;
	public Map adminLogin(Map admin) {
		// TODO Auto-generated method stub
		return adminDao.adminLogin(admin);
	}

}
