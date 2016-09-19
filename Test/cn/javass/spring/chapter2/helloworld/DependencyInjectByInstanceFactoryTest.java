package cn.javass.spring.chapter2.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectByInstanceFactoryTest {

	@Test
	public void test() {
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/instanceFactoryDependencyInject.xml");
		HelloApi api=factory.getBean("byindex", HelloApi.class);
		api.sayHello();
	}
	
	@Test
	public void testbytype(){
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/instanceFactoryDependencyInject.xml");
		HelloApi api=factory.getBean("bytype", HelloApi.class);
		api.sayHello();
	}
	
	
	@Test
	public void testbyname(){
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/instanceFactoryDependencyInject.xml");
		HelloApi api=factory.getBean("byname", HelloApi.class);
		api.sayHello();
	}

}
