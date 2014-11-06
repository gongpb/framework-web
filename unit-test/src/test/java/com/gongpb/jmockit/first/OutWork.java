package com.gongpb.jmockit.first;

public class OutWork {
	public OutWork (){
		System.out.println("OutWork---");
	}
	private InWork inWork = new InWork();
	public int intReturningMethod() {
		System.out.println("111111111111111");
        return inWork.work();  
    }  
  
    public String stringReturningMethod() {  
        return "hello";  
    }  
}
