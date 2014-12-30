package com.gongpb.ad.jackson;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CyclicBarrier;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.map.ser.FilterProvider;
import org.codehaus.jackson.map.ser.impl.SimpleBeanPropertyFilter;
import org.codehaus.jackson.map.ser.impl.SimpleFilterProvider;

import com.gongpb.jackson.PropertyNamingStrategy.MyPropertyNamingStrategy;

public class JacksonMapperUtil {
	public final static ObjectMapper mapper = new ObjectMapper();
	private static ObjectWriter writer = null;
	
	private JacksonMapperUtil (){
	}
	public static ObjectWriter getWriter(){
		return writer;
	}
//	static {
//		mapper.setPropertyNamingStrategy(new MyPropertyNamingStrategy());
//		FilterProvider filtersIn = new SimpleFilterProvider().addFilter(
//				"AdVoFilter",
//				SimpleBeanPropertyFilter.serializeAllExcept(getFilter()));
//		writer = mapper.writer(filtersIn);
//	}
	
	private static Set<String> getFilter() {
		Set<String> set = new HashSet();
			set.add("js");
		return set;
	}

}
