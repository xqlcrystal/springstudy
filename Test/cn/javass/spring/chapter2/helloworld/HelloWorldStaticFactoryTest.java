package cn.javass.spring.chapter2.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldStaticFactoryTest {

	@Test
	public void test() {
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter2/instantiatingBean.xml");
		HelloApi api=factory.getBean("bean3", HelloApi.class);
		api.sayHello();
	}

}
