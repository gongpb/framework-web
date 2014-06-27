package com.gongpb.framework.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gongpb.framework.mvc.dao.UserDao;

@Service
@Transactional
public class UserServivce {
	@Autowired
	private UserDao UserDao;
	
	
}
