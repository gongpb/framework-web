package com.gongpb.jackson.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

public class JacksonMapper {
	private static final ObjectMapper mapper = new ObjectMapper();  
	
	public static ObjectMapper getInstance(){
		return mapper;
	}
	private JacksonMapper (){
	}
	
	public static String convertObject2Json(Object obj){
		String result = "";
		try {
			result = mapper.writeValueAsString(obj);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static <T> T convertJson2Object(String json, Class<T> clzz) {
		 // 设置输入时忽略在JSON字符串中存在但Java对象实际没有的属性  
		mapper.disable(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES);  
		mapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false); 
		try {
			return mapper.readValue(json, clzz);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
