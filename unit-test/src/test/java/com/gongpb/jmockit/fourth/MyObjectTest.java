package com.gongpb.jmockit.fourth;
import static org.junit.Assert.*;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.Verifications;

import org.junit.Test;

public class MyObjectTest {
	@Mocked
	// 用@Mocked标注的对象，不需要赋值，jmockit自动mock
	MyObject obj;

	/**
	 * 非局部模拟
	 */
	@Test
	public void testHello() {
		new NonStrictExpectations() {// 录制预期模拟行为
			{
				obj.hello("Zhangsan");
				returns("Hello");
				// 也可以使用：result = "Hello Zhangsan";
			}
		};
//		assertEquals("Hello Zhangsan", obj.hello("Zhangsan"));// 调用测试方法
		System.out.println(obj.hello("Zhangsan"));
		new Verifications() {// 验证预期Mock行为被调用
			{
				obj.hello("Zhangsan");
				times = 1;
			}
		};
	}

	/**
	 * 局部模拟
	 */
	@Test  
	public void testHello2() {  
	    final MyObject obj2 = new MyObject();  
	    new NonStrictExpectations(obj) {//录制预期模拟行为  
	        {  
	        	obj2.hello("Zhangsan");  
	            returns("Hello Zhangsan");  
	            //也可以使用：result = "Hello Zhangsan";  
	        }  
	    };  
	    assertEquals("Hello Zhangsan", obj2.hello("Zhangsan"));//调用测试方法  
	    new Verifications() {//验证预期Mock行为被调用  
	        {  
	        	obj2.hello("Zhangsan");  
	            times = 1;  
	        }  
	    };  
	}  
}
