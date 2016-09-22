package cn.javass.spring.chapter2.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import cn.javass.spring.chapter3.bean.NavigationA;
import cn.javass.spring.chapter3.bean.NavigationC;
public class DependencyInjectTest {

	@Test
	public void test() {
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/navigationBeanInject.xml");
		NavigationA api=factory.getBean("a", NavigationA.class);
		api.getNabigationB().getNagibationC().sayNavigation();;
		api.getNabigationB().getList().get(0).sayNavigation();
		api.getNabigationB().getMap().get("key").sayNavigation();
		((NavigationC)api.getNabigationB().getProperties().get("0")).sayNavigation();
		api.getNabigationB().getArray()[0].sayNavigation();
	}

}
