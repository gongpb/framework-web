package com.gongpb.ad.fastjson;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.gongpb.ad.vo.AdVo;

public class Run {
	private static final SerializerFeature[] features = { SerializerFeature.WriteMapNullValue, // 输出空置字段 
        SerializerFeature.WriteNullListAsEmpty, // list字段如果为null，输出为[]，而不是null 
        SerializerFeature.WriteNullNumberAsZero, // 数值字段如果为null，输出为0，而不是null 
        SerializerFeature.WriteNullBooleanAsFalse, // Boolean字段如果为null，输出为false，而不是null 
        SerializerFeature.WriteNullStringAsEmpty // 字符类型字段如果为null，输出为""，而不是null 
	};
	
	public static void main(String[] args) throws IOException {
		Long time = System.currentTimeMillis();
		AdVo adVo = new AdVo();
		String json = JSON.toJSONString(adVo, features);
		System.out.println(json);
		Long timeE = System.currentTimeMillis();
		System.out.println("total time1 = "+ ( timeE- time));
		
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(adVo));
		System.out.println("total time2 = "+ ( System.currentTimeMillis()- timeE));
	}
}
