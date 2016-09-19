package cn.javass.spring.chapter3.Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javass.spring.chapter2.helloworld.HelloApi;

public class HelloImpl4Test {

	@Test
	public void test() {
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/setterDependencyInject.xml");
		HelloApi api=factory.getBean("bysetter", HelloApi.class);
		api.sayHello();
	}

}
