package com.gongpb.framework.mvc.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gongpb.framework.mvc.demo.entity.User;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@RequestMapping("/login.do")
	public ModelAndView login(HttpSession session, User user){
		if("admin".equals(user.getUserName()) && "admin".equals(user.getPassword())){
			System.out.println("---------登录成功----------");
		}

		session.setAttribute("userName", user.getUserName());
		return new ModelAndView("user/index.vm");
	}
}