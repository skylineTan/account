package com.account.dao;

import java.util.Map;

import com.account.model.Admin;

public interface AdminDao {
	/**
	 * ¹ÜÀíÔ±µÇÂ¼
	 * @param admin
	 * @return
	 */
	Map adminLogin(Map admin);
}
