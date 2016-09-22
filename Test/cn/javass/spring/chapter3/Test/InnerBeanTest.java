package cn.javass.spring.chapter3.Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javass.spring.chapter2.helloworld.HelloApi;

public class InnerBeanTest {

	@Test
	public void test() {
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/innerBean.xml");
		HelloApi api=factory.getBean("bean", HelloApi.class);
		api.sayHello();
	}
	
	
	@Test
	public void testInner() {
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/innerBean.xml");
		HelloApi api=factory.getBean("helloApi", HelloApi.class);
		api.sayHello();
	}

}
