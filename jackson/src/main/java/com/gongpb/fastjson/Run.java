package com.gongpb.fastjson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.PropertyPreFilter;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.gongpb.fastjson.bean.AdressFastJson;
import com.gongpb.fastjson.bean.UserFastJson;
import com.gongpb.fastjson.util.ExcliudeSimplePropertyPreFilter;

public class Run {
	private static final SerializerFeature[] features = {
		SerializerFeature.WriteMapNullValue, // 输出空置字段 
        SerializerFeature.WriteNullListAsEmpty, // list字段如果为null，输出为[]，而不是null 
        SerializerFeature.WriteNullNumberAsZero, // 数值字段如果为null，输出为0，而不是null 
        SerializerFeature.WriteNullBooleanAsFalse, // Boolean字段如果为null，输出为false，而不是null 
        SerializerFeature.WriteNullStringAsEmpty // 字符类型字段如果为null，输出为""，而不是null 
    }; 
	
	public static void main(String[] args) {
		List<UserFastJson> list = new ArrayList<UserFastJson>();
		UserFastJson bean = new UserFastJson();
		bean.setEmail("hoojo_@126.com");
		bean.setId(1);
		bean.setName("hoojo");
		bean.setBirthday("1988-01-01");
		AdressFastJson address = new AdressFastJson();
		address.setId(1001);
		bean.setAddress(address);
		
		UserFastJson bean2 = new UserFastJson();
		bean2.setEmail("hoojo_@126.com");
		bean2.setId(2);
		bean2.setName("hoojo");
		bean2.setBirthday("2000-01-01");
		AdressFastJson address2 = new AdressFastJson();
		address2.setId(1002);
		bean2.setAddress(address2);
		
		UserFastJson bean3 = new UserFastJson();
		bean3.setEmail("hoojo_@126.com");
		bean3.setId(3);
		bean3.setName("hoojo");
		bean2.setBirthday("1998-01-01");
		
		list.add(bean);
		list.add(bean2);
//		list.add(bean3);
		System.out.println("----------时间格式---------");
		String json = JSON.toJSONString(list, SerializerFeature.WriteDateUseDateFormat);
		System.out.println(json);
		String json2 = JSON.toJSONStringWithDateFormat(list, "yyyy-MMdd HH:mm:ss.SSS");
		System.out.println(json2);
		
		System.out.println("----------美化输出--------");
		String json3 = JSON.toJSONString(list, true);
		System.out.println(json3);
		
		System.out.println("----------空输出---------");
		String jsonNull = JSON.toJSONString(list, features);
		System.out.println(jsonNull);
		
		System.out.println("\n ----------过滤字段---------");
		System.out.println("----------includes--------");
		PropertyPreFilter filterU = new SimplePropertyPreFilter(UserFastJson.class, "NAME", "ID","BIRTHDAY");
		PropertyPreFilter filterB = new ExcliudeSimplePropertyPreFilter(AdressFastJson.class, false, "ID");
		PropertyPreFilter[] filterArray = {filterU, filterB};
		String json4 = JSON.toJSONString(list, filterArray, features);
		System.out.println(json4);
		
		System.out.println("----------excludes--------");
		PropertyFilter filter2 = new PropertyFilter() {
		      public boolean apply(Object source, String name, Object value) {
		    	  if("NAME".equals(name)){
		    		  return false;
		    	  }
		          return true;
		      }
		 };
		 
		 SerializeWriter out = new SerializeWriter();
		 JSONSerializer serializer = new JSONSerializer(out);
		 serializer.getPropertyFilters().add(filter2);
		 serializer.write(list);
		 
		 String text = out.toString();
		 System.out.println(text);
		 
		 Map<String, List<UserFastJson>> map = new HashMap<String, List<UserFastJson>>();
		 map.put("mapKey", list);
		 System.out.println("\n mapKey:");
		 System.out.println(JSON.toJSONString(map));
		 
	}
	
}
