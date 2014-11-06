package com.gongpb.jmockit.privateMethod;

public class ClassMocked {
	private String url = "";
	
	private int privateMethod (int num){
		return num;
	}
	public String sayHello (String name, int num){
		return "hello_"+name+ " "+ this.privateMethod(num);
	}
	
	public String getUrl(String param){
		return url + "/" + param;
	}
}
