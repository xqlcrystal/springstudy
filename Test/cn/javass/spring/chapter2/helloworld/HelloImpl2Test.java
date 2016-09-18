package cn.javass.spring.chapter2.helloworld;

import static org.junit.Assert.*;


import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloImpl2Test {

	@Test
	public void test() {
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter2/helloworld.xml");
		HelloApi api=factory.getBean("bean2", HelloApi.class);
		api.sayHello();
	}

}
