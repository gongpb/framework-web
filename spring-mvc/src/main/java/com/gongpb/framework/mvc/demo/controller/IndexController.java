package com.gongpb.framework.mvc.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class IndexController {
	private static Logger logger = LoggerFactory.getLogger(IndexController.class);
	@RequestMapping("/index.do")
	public String index() {
		logger.info("---登录login----");
		return "login.jsp";
	}
}