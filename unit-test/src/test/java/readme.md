参考：http://blog.csdn.net/chjttony/article/details/17838693
http://blog.csdn.net/ultrani/article/details/8993364

1、环境
<dependency>
    	<groupId>com.googlecode.jmockit</groupId>
		<artifactId>jmockit</artifactId>
		<version>1.7</version>
		<scope>test</scope>
</dependency>
<dependency>
	  <groupId>com.googlecode.jmockit</groupId>
	  <artifactId>jmockit-coverage</artifactId>
	  <version>0.999.26</version>
	  <scope>test</scope>
</dependency>
放在junit之前加载，否则会报异常

2、 record阶段：录制期望。也可以理解为数据准备阶段。创建依赖的class 或interface或method ，模拟返回的数据，及调用的次数等。
a)期望录制Expectations和NonStrictExpectations
用Expectations类定义的，则mock对象在运行时只能按照 Expectations块中定义的顺序依次调用方法，不能多调用也不能少调用，所以可以省略掉Verifications块；
而用NonStrictExpectations类定义的，则没有这些限制，所以如果需要验证，则要添加Verifications块。
返回结果：
                 result ="str1";
//               returns("str1", "str2");  
//               result = new Exception("testException"); 
调用次数：times=3;

b)根据Expectations块是否有参数，分为非局部模拟与局部模拟

c)基于行为的测试(类似于黑盒)
可以使用jmockit的基于行为的mock方式。在这种方式中，目的是测试单元测试及其依赖代码的调用过程，验证代码逻辑是否满足测试路径。  
由于被依赖代码可能在自己单测中已测试过，或者难以测试，就需要把这些被依赖代码的逻辑用预定期待的行为替换掉，也就是mock掉，从而把待测是代码隔离开，这也是单元测试的初衷
d)基于状态的测试(类似于白盒)
MockUp修改被测试方法内部逻辑
对于这种情景，可以使用jmockit基于状态的mock方式。目的是从被测代码的使用角度出发，结合数据的输入输出来检验程序运行的这个正确性。
使用这个方式，需要把被依赖的代码mock掉，实际上相当于改变了被依赖的代码的逻辑。
通常在集成测试中，如果有难以调用的外部接口，就通过这个方式mock掉，模拟外部接口

e)静态方法mock方式,demo：com.gongpb.jmockit.util
d)mock私有方法、私有静态方法、私有属性设置value 方法:
final ClassMocked obj = new ClassMocked();
Deencapsulation.invoke(obj, "privateMethod", 1);
Deencapsulation.setField(obj, "url", "http://youku.com"); 

3、replay阶段：通过调用被测代码，执行测试。期间会invoke 到 第一阶段record的mock对象或方法
调用真实要测试的方法

4、verify阶段：验证。可以验证调用返回是否正确。及mock的方法调用次数等
new Verifications() {// 验证预期Mock行为被调用
			{
				obj.hello("Zhangsan");
				times = 1;
			}
};

5、
Expectations:这是录制期望发生行为的地方。result和times都是其内定成员变量。result可以重定义录制行为的返回值甚至通过Delegate来重定义行为，
times是期待录制行为的发生次数。在Expectations中发生的调用，均会被mock。由于没定义result，调用的结果返回空

注意：方法在哪个类中实现，就通过哪个类实现
