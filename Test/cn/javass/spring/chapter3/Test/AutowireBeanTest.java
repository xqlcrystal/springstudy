package cn.javass.spring.chapter3.Test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javass.spring.chapter2.helloworld.HelloApi;
import cn.javass.spring.chapter3.bean.HelloApiDecorator;

public class AutowireBeanTest {

	@Ignore
	@Test
	public void test() {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("chapter3/autowire-byName.xml");
		HelloApi api= context.getBean("bean", HelloApi.class);
		api.sayHello();
	}
	
	
	@Test
	public void testbyType(){
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("chapter3/autowire-byType.xml");
		HelloApi api= context.getBean("bean", HelloApi.class);
		api.sayHello();
	}

}
