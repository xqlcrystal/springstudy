package cn.javass.spring.chapter3.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javass.spring.chapter3.bean.DependentBean;

public class MoreDependencyInjectTest {

	@Test
	public void test() throws IOException {
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("chapter3/depends-on.xml");
		context.registerShutdownHook();
		DependentBean bean=context.getBean("dependentBean", DependentBean.class);
		bean.write("aaa");
	}

}
