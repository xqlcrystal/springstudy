package cn.javass.spring.chapter2.helloworld;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.Assert;

public class HelloTest {
	
	@Test
	public void testHelloworld(){
		ApplicationContext context=new ClassPathXmlApplicationContext("chapter2/helloworld.xml");
		HelloApi api=context.getBean("hello",HelloApi.class);
		api.sayHello();
	}
	
	@Ignore
	@Test
	public void testTypeonly(){
		
		ApplicationContext context=new ClassPathXmlApplicationContext("chapter2/helloworld.xml");
		HelloApi api=context.getBean(HelloApi.class);
		api.sayHello();
	}
	
	@Test
	public void testNameOnly(){
		ApplicationContext context=new ClassPathXmlApplicationContext("chapter2/helloworld.xml");
		HelloApi api=context.getBean("bean",HelloApi.class);
		api.sayHello();
	}
	
	@Test
	public void testalias(){
		ApplicationContext context=new ClassPathXmlApplicationContext("chapter2/helloworld.xml");
		HelloApi api=context.getBean("alias1",HelloApi.class);
		api.sayHello();
	}
	
	
	@Test
	public void testaliasandname(){
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter2/helloworld.xml");
		String[] alias3=factory.getAliases("alias3");
		Assert.assertEquals(1, alias3.length);
	}
	
	@Test
	public void testmulName(){
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter2/helloworld.xml");
		HelloApi bean1=factory.getBean("bean11",HelloApi.class);
		
		bean1.sayHello();
		
		HelloApi bean12=factory.getBean("bean12",HelloApi.class);
		bean12.sayHello();
		
		HelloApi bean13=factory.getBean("bean13",HelloApi.class);
		bean13.sayHello();
		
		HelloApi bean14=factory.getBean("bean14",HelloApi.class);
		bean14.sayHello();
		
	}
	
	
	@Test
	public void testAliaslength(){
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter2/helloworld.xml");
		String[] bean11=factory.getAliases("bean11");
		Assert.assertEquals(3, bean11.length);
	}
	
	@Test
	public void testAliasname(){
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter2/helloworld.xml");
		HelloApi api=factory.getBean("myalias", HelloApi.class);
	api.sayHello();
	}

}
