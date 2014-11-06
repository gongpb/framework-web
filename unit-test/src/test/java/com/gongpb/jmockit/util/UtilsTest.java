package com.gongpb.jmockit.util;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Verifications;

import org.junit.After;
import org.junit.Test;
/**
 * 静态方法的调用
 * @author gongpibao
 */
public class UtilsTest {

	@Test
	public void testMockStaticMethod() {
		// 打印mock前返回值
		try {
			System.out.println(Utils.getFormatStr());
		} catch (Exception e) {
			assertTrue(false);
		}

		new MockUp<Utils>() {
			// 除了static关键字, 其他方法定义内容保持与被mock方法一致(包括异常定义)
			@Mock
			public String getFormatStr() throws Exception {
				return "OtherFormat: dd-mm-YYYY";
			}
		};
		// 打印mock后返回值
		try {
			System.out.println("result："+Utils.getS());
		} catch (Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void testMockStaticMethod2() {
		// 打印mock前返回值
		try {
			System.out.println(Utils.getFormatStr());
		} catch (Exception e) {
			fail(e.getMessage());
		}

		new Expectations(Utils.class){
			{
				try {
					Utils.getFormatStr();
					result = "hello";
				}catch (Exception e){
					fail(e.getMessage());
				}
			}
		};
		// 打印mock后返回值
		try {
			System.out.println("result："+Utils.getS());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@After
	public void tearDown() {
		// 最后做还原动作, 确保用例之间不相互影响.
	}
}
