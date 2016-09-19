package cn.javass.spring.chapter3.Test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import cn.javass.spring.chapter3.bean.IdRefTestBean;

public class idRefInjectTest {

	@Test
	public void test() {
		BeanFactory factory = new ClassPathXmlApplicationContext("chapter3/idRefInject.xml");
		IdRefTestBean bean = factory.getBean("idrefbean1", IdRefTestBean.class);
		System.out.println(bean.getId());
	}

	@Test
	public void testidreflocal() {
		BeanFactory factory = new ClassPathXmlApplicationContext("chapter3/idRefInject.xml");
		IdRefTestBean bean = factory.getBean("idrefbean2", IdRefTestBean.class);
		System.out.println(bean.getId());
	}
}
