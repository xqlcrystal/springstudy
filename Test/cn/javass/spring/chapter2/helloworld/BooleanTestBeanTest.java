package cn.javass.spring.chapter2.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javass.spring.chapter3.BooleanTestBean;

public class BooleanTestBeanTest {

	@Test
	public void test() {
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/booleanInject.xml");
		BooleanTestBean bean=factory.getBean("booleantest", BooleanTestBean.class);
		System.out.println(bean.isSuccess());
	}

	@Test
	public void testyes() {
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/booleanInject.xml");
		BooleanTestBean bean=factory.getBean("booleanyes", BooleanTestBean.class);
		System.out.println(bean.isSuccess());
	}
	
	
	@Test
	public void tes1() {
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/booleanInject.xml");
		BooleanTestBean bean=factory.getBean("boolean1", BooleanTestBean.class);
		System.out.println(bean.isSuccess());
	}
}
