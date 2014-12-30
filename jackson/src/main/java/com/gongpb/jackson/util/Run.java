package com.gongpb.jackson.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.gongpb.jackson.bean.AddressJackJson;
import com.gongpb.jackson.bean.UserJackJson;
/**
 *美化writerWithDefaultPrettyPrinter
 * @author gongpibao
 *
 */
public class Run {
	public static void main(String[] args) throws IOException {
		List<UserJackJson> list = new ArrayList<UserJackJson>();
		initData(list);
		System.out.println(JacksonMapper.convertObject2Json(list));
		System.out.println("\n");
		
		String json = "{\"ID\":1,\"NAME\":\"hoojo\",\"EMAIL\":\"hoojo_@126.com\",\"ADDRESS\":{\"ID\":null,\"POSTCODE\":\"0100000\",\"CITY\":null,\"PROVINCE\":null},\"BIRTHDAY\":\"1988-09-01\"}";
		UserJackJson userBean = JacksonMapper.convertJson2Object(json, UserJackJson.class);
		System.out.println(userBean.toString());
		System.out.println("\n");
		
		System.out.println("list:");
		String jsonList = "[{\"ID\":1,\"NAME\":\"youku\",\"EMAIL\":\"hoojo_@126.com\",\"ADDRESS\":{\"ID\":1001,\"POSTCODE\":\"0100000\",\"CITY\":null,\"PROVINCE\":null},\"BIRTHDAY\":\"1988-09-01\"},{\"ID\":2,\"NAME\":\"tudou\",\"EMAIL\":\"hoojo_@126.com\",\"ADDRESS\":{\"ID\":1002,\"POSTCODE\":\"0100001\",\"CITY\":null,\"PROVINCE\":null},\"BIRTHDAY\":\"1988-09-01\"}]";
		List<UserJackJson> listResult = (List<UserJackJson>) JacksonMapper.json2GenericObject(jsonList, new TypeReference<List<UserJackJson>>() {});
		for(UserJackJson u:listResult) {
			System.out.println(u.getId() + " " + u.getAddress().getId());
		}
		
		ObjectMapper mapper = new ObjectMapper(); 
		System.out.println("美化\n"+mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list));
		
		Map<String, List<UserJackJson>> map = new HashMap<String, List<UserJackJson>>();
		map.put("mapKey", list);
		System.out.println("map\n"+JacksonMapper.convertObject2Json(map));
		
		String jsonMap = "{\"mapKey\":[{\"ID\":1,\"NAME\":\"youku\",\"EMAIL\":\"hoojo_@126.com\",\"ADDRESS\":{\"ID\":1001,\"POSTCODE\":\"0100000\",\"CITY\":null,\"PROVINCE\":null},\"BIRTHDAY\":\"1988-09-01\"},{\"ID\":2,\"NAME\":\"tudou\",\"EMAIL\":\"hoojo_@126.com\",\"ADDRESS\":{\"ID\":1002,\"POSTCODE\":\"0100001\",\"CITY\":null,\"PROVINCE\":null},\"BIRTHDAY\":\"1988-09-01\"}]}";
		System.out.println("\nmapJsonToObject:");
		
		Map<String, List<UserJackJson>> mapResult = 
				JacksonMapper.json2GenericObject(jsonMap, new TypeReference<Map<String, List<UserJackJson>>>() {});
		List<UserJackJson> listMapResult = mapResult.get("mapKey");
		for(UserJackJson u:listMapResult) {
			System.out.println(u.getId() + " " + u.getAddress().getId());
		}
		
	}

	
	private static void initData(List<UserJackJson> list){
		UserJackJson bean = new UserJackJson();
		bean.setEmail("hoojo_@126.com");
		bean.setId(1);
		bean.setName("youku");
		bean.setBirthday("1988-09-01");
		AddressJackJson address = new AddressJackJson();
		address.setId(1001);
		address.setPostCode("0100000");
		bean.setAddress(address);
		
		UserJackJson bean2 = new UserJackJson();
		bean2.setEmail("hoojo_@126.com");
		bean2.setId(2);
		bean2.setName("tudou");
		bean2.setBirthday("1988-09-01");
		AddressJackJson address2 = new AddressJackJson();
		address2.setId(1002);
		address2.setPostCode("0100001");
		bean2.setAddress(address2);
		
		list.add(bean);
		list.add(bean2);
	}
	
}
