package com.gongpb.jackson.jsonView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
/**
@JsonView 中的这个视图不仅可以用接口，也可以是一般的类，或者说只要有Class属性就能当成视图使用。 
类或接口间的继承，也是视图之间的继承，继承后的视图会包含上级视图注解的方法。 
@JsonView 可以写到方法上或者字段上。 

@JsonView(BView.class)
@JsonProperty("BPROPERTY")
View字段的大写要写在get方法上面

*/
class Run {
	
	public static void main(String[] args) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		ObjectWriter writer1 = objectMapper.writerWithView(UserBean.BView.class);
		
		// 创建对象
		UserBean user = new UserBean("isea533", "123456");
		user.setId(1001);
		
		// 序列化
		String json1 = writer1.writeValueAsString(user);
		System.out.println("1："+json1);

		ObjectWriter writer2 = objectMapper.writerWithView(UserBean.FView.class);
		String json2 = writer2.writeValueAsString(user);
		System.out.println("2："+json2);
//		defaultPrettyPrintingWriter
		
		System.out.println("\n");
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		objectMapper.writerWithView(UserBean.BView.class).writeValue(bos, user);
		System.out.println("3："+bos.toString());
	}

}
