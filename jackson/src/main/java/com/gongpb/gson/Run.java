package com.gongpb.gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gongpb.gson.bean.AdressGson;
import com.gongpb.gson.bean.UserGson;
import com.gongpb.gson.strategy.AdExclusionStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Run {
	public static void main(String[] args) {
		Gson gson1 = new GsonBuilder()
	    .excludeFieldsWithoutExposeAnnotation() // <---
	    .create();

		System.out.println("---------Object转json---------");
		List<UserGson> list = new ArrayList<UserGson>();
		initData(list);
		System.out.println(gson1.toJson(list));
		
		Gson gson = new Gson(); 
		Map<String, List<UserGson>> map = new HashMap<String, List<UserGson>>();
		map.put("mapKey", list);
		System.out.println(gson.toJson(map));
		
		System.out.println("---------json转Object---------");
		String json = "{\"mapKey\":[{\"ID\":1,\"NAME\":\"youku\",\"EMAIL\":\"hoojo_@126.com\",\"BIRTHDAY\":\"1988-09-01\",\"ADDRESS\":{\"id\":1001,\"postCode\":\"0100000\"}},{\"ID\":2,\"NAME\":\"tudou\",\"EMAIL\":\"hoojo_@126.com\",\"BIRTHDAY\":\"1988-09-01\",\"ADDRESS\":{\"id\":1002,\"postCode\":\"0100001\"}}]}";
		
		Map<String, List<UserGson>> map2 = gson.fromJson(json, new TypeToken< Map<String, List<UserGson>> >(){}.getType());
		List<UserGson> listMap = map2.get("mapKey");
		for(UserGson ug:listMap){
			System.out.println(ug.getId()+" "+ ug.getAddress().getPostCode());
		}
		//---------动态过滤字段-----------
		System.out.println("---------动态过滤字段---------");
		
		String[] filedArray = {"id","seed"};
		AdExclusionStrategy adExclusionStrategy = new AdExclusionStrategy(UserGson.class, filedArray);
		Class[] cl = {AdressGson.class};
		AdExclusionStrategy adExclusionStrategy2 = new AdExclusionStrategy(cl);
		
		Gson gsonStrategy = new GsonBuilder()
				.setExclusionStrategies(adExclusionStrategy)
				.setExclusionStrategies(adExclusionStrategy2)
//				.registerTypeAdapter(UserGson.class, new AdAdaper(UserGson.class))
//				.registerTypeAdapter(AdressGson.class, new AdAdaper(AdressGson.class))
				.serializeNulls() // <---
				.create();
		String jsonStrategy = gsonStrategy.toJson(list);
		System.out.println(jsonStrategy);
	}
	
	private static void initData(List<UserGson> list){
		UserGson bean = new UserGson();
		bean.setEmail("hoojo_@126.com");
		bean.setId(1);
		bean.setName("youku");
		bean.setBirthday("1988-09-01");
		AdressGson address = new AdressGson();
		address.setId(1001);
		address.setPostCode("0100000");
		address.setCity("北京");
		bean.setAddress(address);
		
		UserGson bean2 = new UserGson();
		bean2.setEmail("hoojo_@126.com");
		bean2.setId(2);
		bean2.setName("tudou");
		bean2.setBirthday("1988-09-01");
		AdressGson address2 = new AdressGson();
		address2.setId(1002);
		address2.setPostCode("0100001");
		bean2.setAddress(address2);
		
		list.add(bean);
		list.add(bean2);
	}
}
