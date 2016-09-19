package cn.javass.spring.chapter3.Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javass.spring.chapter2.helloworld.HelloApi;

public class LocalAndParentTest {

	@Test
	public void test() {
		ApplicationContext parentBeanContext=new ClassPathXmlApplicationContext("chapter3/parentBeanInject.xml");
		ApplicationContext beanContext=new ClassPathXmlApplicationContext(new String[]{"chapter3/localBeanInject.xml"},parentBeanContext);
		HelloApi api=beanContext.getBean("bean1", HelloApi.class);
		api.sayHello();
		
		HelloApi api2=beanContext.getBean("bean2", HelloApi.class);
		api2.sayHello();
	}

}
