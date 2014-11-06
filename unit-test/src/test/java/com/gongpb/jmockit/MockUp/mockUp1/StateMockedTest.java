package com.gongpb.jmockit.MockUp.mockUp1;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import mockit.Mock;
import mockit.MockUp;

import org.junit.Test;

public class StateMockedTest {

	@Test  
	public void testMockNormalMethodContent() throws IOException {  
	    StateMocked obj = new StateMocked();  
	    new MockUp<StateMocked>() {//使用MockUp修改被测试方法内部逻辑  
	        @Mock  
	      public int getTriple(int i) {  
	            return i * 30;  
	        }  
	    };  
	    System.out.println(obj.getTriple(1));
	    System.out.println(obj.getTriple(2)); 
	}  

}
