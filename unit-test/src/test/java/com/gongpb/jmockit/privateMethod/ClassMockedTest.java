package com.gongpb.jmockit.privateMethod;

import static org.junit.Assert.assertEquals;
import mockit.Deencapsulation;
import mockit.NonStrictExpectations;
import mockit.Verifications;

import org.junit.Test;
/**
 * mock私有方法
 * 
 * @author gongpibao
 *
 */
public class ClassMockedTest {

	@Test
	public void testSayHello() {
		final ClassMocked obj = new ClassMocked();  
	    new NonStrictExpectations(obj) {  
	        {  
	        	Deencapsulation.invoke(obj, "privateMethod", 1);
	            result = 200;
	        }
	    };
	  
	    String actual = obj.sayHello("小宝", 1);
	    System.out.println(actual);
	  
	    new Verifications() {  
	        {  
	        	Deencapsulation.invoke(obj, "privateMethod", 1);  
	            times = 1;  
	        }  
	    };  
	}
	
	@Test
	public void testField() {
		final ClassMocked obj = new ClassMocked();  
	    new NonStrictExpectations(obj) {  
	        {  
	        	Deencapsulation.setField(obj, "url", "http://youku.com");  
	        }
	    };
	  
	    String actual = obj.getUrl("atm");
	    System.out.println(actual);
	}

}
