package com.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 配置路由
 * @author Administrator
 *
 */
@Controller
public class PageController {
@RequestMapping("/")
public String rootPage()
	{
		return "index";
	}
}
