package com.gongpb.jackson.util;

import org.junit.Before;
import org.junit.Test;

import com.gongpb.jackson.bean.Birthday;
import com.gongpb.jackson.bean.User;

public class Run {
	public static void main(String[] args) {
		User bean = new User();
		bean.setAddress("china-Guangzhou");
		bean.setEmail("hoojo_@126.com");
		bean.setId(1);
		bean.setName("hoojo");
		Birthday birthday = new Birthday("1980-01-01");
		bean.setBirthday(birthday);

		System.out.println(JacksonMapper.convertObject2Json(bean));
		System.out.println("\n");
		
		String json = "{\"NAME\":\"hoojo\",\"EMAIL\":\"hoojo_@126.com\",\"ADDRESS\":\"china-Guangzhou\",\"BIRTHDAY\":{\"BIRTHDAY\":\"1980-01-01\"},\"id\":1}";
		;
		User userBean = JacksonMapper.convertJson2Object(json, User.class);
		System.out.println(userBean.toString());
		System.out.println("\n");
	}

	
}
