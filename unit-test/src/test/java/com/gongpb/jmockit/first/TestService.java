package com.gongpb.jmockit.first;

public class TestService {
	// 1、构造方法  
    private OutWork work = new OutWork();  
    
    public TestService() {
    }
  
    public String doSomthing() {  
        // 2、intReturningMethod()方法  
        int n = work.intReturningMethod();  
  
        String s = "";  
        for (int i = 0; i < n; i++) {  
            try {  
                // 3、stringReturningMethod()方法  
                s = s+ ":" + work.stringReturningMethod();  
            } catch (Exception e) {  
                // 处理异常  
            	System.out.println(e);
                e.printStackTrace();  
            }  
        }  
  
        // 其它逻辑...  
        return s;
    }

	public void setWork(OutWork work) {
		this.work = work;
	}  
    
}
