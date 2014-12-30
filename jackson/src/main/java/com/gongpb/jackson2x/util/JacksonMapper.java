package com.gongpb.jackson2x.util;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


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
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);  
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false); 
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
	
	public static <T> List<T> convertJson2List(String json, Class<T> clzz) {
		 // 设置输入时忽略在JSON字符串中存在但Java对象实际没有的属性  
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);  
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false); 
		try {
			JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class, clzz);  
			return mapper.readValue(json, javaType);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
     * JSON串转换为Java泛型对象，可以是各种类型，此方法最为强大。用法看测试用例。
     * @param <T>
     * @param jsonString JSON字符串
    * @param tr TypeReference,例如: new TypeReference< List<UserJackJson> >(){}
     * @return List对象列表
     */
    public static <T> T json2GenericObject(String jsonString, TypeReference<T> tr) {
 
        if (jsonString == null || "".equals(jsonString)) {
            return null;
        } else {
            try {
                return (T) mapper.readValue(jsonString, tr);
            } catch (Exception e) {
            	e.getMessage();
            }
        }
        return null;
    }

	
}
