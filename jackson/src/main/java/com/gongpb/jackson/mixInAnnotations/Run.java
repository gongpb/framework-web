package com.gongpb.jackson.mixInAnnotations;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

import com.gongpb.jackson.bean.Birthday;
import com.gongpb.jackson.bean.User;
/**
 * 动态过滤字段
 * annotation mixin
 * @author gongpibao
 *
 *每一种动态字段都会产生一个filter，数量很多的时候不容易管理
 */
public class Run {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		User bean = new User();
        bean.setAddress("china-Guangzhou");
        bean.setEmail("hoojo_@126.com");
        bean.setId(1);
        bean.setName("hoojo");
        Birthday birthday = new Birthday("1980-01-01");
        birthday.setId(1);
        birthday.setZodiac("龙");
        bean.setBirthday(birthday);
        
		ObjectMapper mapper = new ObjectMapper();  
		SerializationConfig serializationConfig = mapper.getSerializationConfig();  
		serializationConfig.addMixInAnnotations(User.class, UserFilter.class);  
		serializationConfig.addMixInAnnotations(Birthday.class, BirthdayFilter.class);  
		
		String json = mapper.writeValueAsString(bean);  
		
		System.out.println(json);
		System.out.println("\n");
	}

}
