package cn.javass.spring.chapter3.Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javass.spring.chapter2.helloworld.HelloApi;

public class DependencyInjectByStaticFactoryTest {

	@Test
	public void test() {
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/staticFactoryDependencyInject.xml");
		HelloApi api=factory.getBean("byindex", HelloApi.class);
		api.sayHello();
	}
	
	@Test
	public void testByName(){
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/staticFactoryDependencyInject.xml");
		HelloApi api=factory.getBean("byname", HelloApi.class);
		api.sayHello();
	}
	
	@Test
	public void testByType(){
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/staticFactoryDependencyInject.xml");
		HelloApi api=factory.getBean("bytype", HelloApi.class);
		api.sayHello();
	}
	

}
