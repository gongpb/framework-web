package com.gongpb.jsonlib;

import net.sf.json.JSONSerializer;

import com.gongpb.jsonlib.bean.AddressJsonLib;
import com.gongpb.jsonlib.bean.UserJsonLib;

public class Run {
	public static void main(String[] args) {
		UserJsonLib bean = new UserJsonLib();
		bean.setEmail("hoojo_@126.com");
		bean.setId(1);
		bean.setName("hoojo");
		bean.setBirthday("1988-09-01");
		AddressJsonLib address = new AddressJsonLib();
		address.setPostCode("0100000");
		bean.setAddress(address);
		
		String result = JSONSerializer.toJSON(bean).toString();
		System.out.println(result);
	}
}