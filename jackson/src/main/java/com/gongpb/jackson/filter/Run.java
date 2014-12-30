package com.gongpb.jackson.filter;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ser.FilterProvider;
import org.codehaus.jackson.map.ser.impl.SimpleBeanPropertyFilter;
import org.codehaus.jackson.map.ser.impl.SimpleFilterProvider;

public class Run {
	public static void main(String[] args) throws IOException {
		UserFilterBean bean = new UserFilterBean();
		bean.setAddress("china-Guangzhou");
		bean.setEmail("hoojo_@126.com");
		bean.setId(1);
		bean.setName("hoojo");
		BirthdayFilterBean birthday= new BirthdayFilterBean("1980-01-01");
		bean.setBirthday(birthday);

		ObjectMapper mapper = new ObjectMapper();
		// 包含字段
		FilterProvider filtersIn = new SimpleFilterProvider().addFilter(
				"UserFilter",
				SimpleBeanPropertyFilter.filterOutAllExcept(getFilter(bean)));
		
		String json1 = mapper.writer(filtersIn).writeValueAsString(bean);  
        System.out.println(json1);  
        System.out.println("\n");
		
		FilterProvider filtersOut = new SimpleFilterProvider()
				.addFilter(
						"UserFilter",
				SimpleBeanPropertyFilter.serializeAllExcept(getFilter(bean)))
				.addFilter(
						"BirthdayFilter",
						SimpleBeanPropertyFilter.serializeAllExcept("ID", "ZODIAC"));
		
		String json2 = mapper.writer(filtersOut).writeValueAsString(bean);  
        System.out.println(json2);
	}

	private static Set<String> getFilter(UserFilterBean value) {
		Set<String> set = new HashSet();
		if (value.getName() != null) {
			set.add("NAME");
			set.add("ID");
		}
		return set;
	}
}
