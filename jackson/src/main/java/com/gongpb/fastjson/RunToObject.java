package com.gongpb.fastjson;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.gongpb.fastjson.bean.UserFastJson;

public class RunToObject {
	public static void main(String[] args) {
		String json = "[{\"ADDRESS\":{\"CITY\":\"\",\"ID\":1001,\"POSTCODE\":\"\",\"PROVINCE\":\"\"},\"BIRTHDAY\":\"1988-01-01\",\"EMAIL\":\"hoojo_@126.com\",\"ID\":1,\"NAME\":\"hoojo\"},{\"ADDRESS\":{\"CITY\":\"\",\"ID\":1002,\"POSTCODE\":\"\",\"PROVINCE\":\"\"},\"BIRTHDAY\":\"1998-01-01\",\"EMAIL\":\"hoojo_@126.com\",\"ID\":2,\"NAME\":\"hoojo\"}]";
		List<UserFastJson> list = JSON.parseArray(json, UserFastJson.class);
		
		for(UserFastJson u:list) {
			System.out.println(u.getId()+" "+u.getAddress().getId());
		}
		
		String jsonObject = "{\"ADDRESS\":{\"CITY\":\"\",\"ID\":1001,\"POSTCODE\":\"\",\"PROVINCE\":\"\"},\"BIRTHDAY\":\"1988-01-01\",\"EMAIL\":\"hoojo_@126.com\",\"ID\":1,\"NAME\":\"hoojo\"}";
		UserFastJson user = JSON.parseObject(jsonObject, UserFastJson.class);
		System.out.println("\n");
		System.out.println(user.getId()+ " " +user.getAddress().getId());
		
		String jsonMap = "{\"mapKey\":[{\"ADDRESS\":{\"ID\":1001},\"BIRTHDAY\":\"1988-01-01\",\"EMAIL\":\"hoojo_@126.com\",\"ID\":1,\"NAME\":\"hoojo\"},{\"ADDRESS\":{\"ID\":1002},\"BIRTHDAY\":\"1998-01-01\",\"EMAIL\":\"hoojo_@126.com\",\"ID\":2,\"NAME\":\"hoojo\"}]}";
//		Map<String, List<UserFastJson>> map =  JSON.parseObject(jsonMap, UserFastJson.class);
		
	}
}
