package com.gongpb.jmockit.MockUp;

import mockit.Mock;
import mockit.MockUp;

import org.junit.Before;
import org.junit.Test;
/**
 * 使用MockUp修改被测试方法内部逻辑
 * 开放set方法，注入，还有没有其它方方法
 * @author gongpibao
 */
public class ServiceTest {
	IService ser = new ServiceImpl();
	
	public String say(String name){
		return "hello："+name+" "+ser.doSth();
	}
	
	@Before
	public void beffore(){
		
	}
	@Test
    public void testSth() throws Exception {
        IService service = new MockUp<IService>() {
            // 需要mock哪个方法就只写哪个方法的mock实现, 其他方法都可以忽略
            @Mock
            public String doSth() {
            	return "this is mock implement";
            }
        }.getMockInstance();

        // 调用mock方法
        System.out.println(service.doSth());
        
        ServiceTest st = new ServiceTest();
        st.setSer(service);
        System.out.println(st.say("gongpb"));
    }
	
	public void setSer(IService ser) {
		this.ser = ser;
	}
	
}
