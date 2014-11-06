package com.gongpb.jmockit.first;

import mockit.Injectable;
import mockit.Mocked;
import mockit.NonStrictExpectations;

import org.junit.Test;
public class UnitUnderTest {
	@Mocked
	OutWork outWork; 
	//1、表明被修饰实例将会自动注入到@Tested修饰的实例中，并且会自动mock掉，除非在测试前被赋值  
	//2、通过setter方法手动注入
	@Injectable   
	InWork inWork;
    @Test  
    public void test() {  
        new NonStrictExpectations() {  
            {  
                // 1、构造方法模拟  
            	new OutWork();  
  
                // 2、intReturningMethod()方法模拟  
            	outWork.intReturningMethod();  
                result = 4;  
  
                // 3、stringReturningMethod()方法模拟  
                outWork.stringReturningMethod();  
                
                // 方法分别返回三个值，两个字符串，一个异常  
                 result ="str1";
//               returns("str1", "str2");  
//               result = new Exception("testException");  
                
            }  
        };  
  
       System.out.println( new TestService().doSomthing() );  
    }  

}
