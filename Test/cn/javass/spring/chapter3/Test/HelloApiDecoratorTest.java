package cn.javass.spring.chapter3.Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javass.spring.chapter2.helloworld.HelloApi;
import cn.javass.spring.chapter3.bean.HelloApiDecorator;

public class HelloApiDecoratorTest {

	@Test
	public void test() {
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/beanInject.xml");
		HelloApiDecorator api=factory.getBean("bean1", HelloApiDecorator.class);
		api.sayHello();
	}
	
	@Test
	public void testBySetter() {
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/beanInject.xml");
		HelloApiDecorator api=factory.getBean("bean2", HelloApiDecorator.class);
		api.sayHello();
	}


}
