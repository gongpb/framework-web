package com.gongpb.jackson.mixInAnnotations;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

import com.gongpb.jackson.bean.AddressJackJson;
import com.gongpb.jackson.bean.UserJackJson;
/**
 * 动态过滤字段
 * annotation mixin
 * @author gongpibao
 *
 *每一种动态字段都会产生一个filter，数量很多的时候不容易管理
 */
public class Run {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		UserJackJson bean = new UserJackJson();
        bean.setEmail("hoojo_@126.com");
        bean.setId(1);
        bean.setName("hoojo");
        AddressJackJson address = new AddressJackJson();
        address.setId(1);
        address.setPostCode("0100000");
        bean.setBirthday("1988-09-01");
        bean.setAddress(address);
        
		ObjectMapper mapper = new ObjectMapper();  
		SerializationConfig serializationConfig = mapper.getSerializationConfig();  
		serializationConfig.addMixInAnnotations(UserJackJson.class, UserFilter.class);  
		serializationConfig.addMixInAnnotations(AddressJackJson.class, BirthdayFilter.class);  
		
		String json = mapper.writeValueAsString(bean);  
		
		System.out.println(json);
		System.out.println("\n");
	}

}
