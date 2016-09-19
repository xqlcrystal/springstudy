package cn.javass.spring.chapter3.Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.javass.spring.chapter3.bean.ArrayTestBean;
import cn.javass.spring.chapter3.bean.CollectionTestBean;
import cn.javass.spring.chapter3.bean.ListTestBean;
import cn.javass.spring.chapter3.bean.MapTestBean;
import cn.javass.spring.chapter3.bean.PropertiesTestBean;
import junit.framework.Assert;

public class ListTestBeanTest {

	@Test
	public void test() {
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/listInject.xml");
		ListTestBean bean=factory.getBean("listBean", ListTestBean.class);
		System.out.println(bean.getValues());
		Assert.assertEquals(3, bean.getValues().size());
	}
	
	@Test
	public void testCollection(){
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/listInject.xml");
		CollectionTestBean bean=factory.getBean("setBean", CollectionTestBean.class);
		System.out.println(bean.getValues());
		Assert.assertEquals(3, bean.getValues().size());
	}
	
	@Test
	public void testArray(){
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/listInject.xml");
		ArrayTestBean bean=factory.getBean("arrayBean", ArrayTestBean.class);
		System.out.println(bean.getArray());
		Assert.assertEquals(2, bean.getArray2().length);
	}
	
	
	@Test
	public void testMap(){
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/listInject.xml");
		MapTestBean bean=factory.getBean("mapBean", MapTestBean.class);
		System.out.println(bean.getValues());
		Assert.assertEquals(2, bean.getValues().size());
	}
	
	
	@Test
	public void testProperties(){
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/listInject.xml");
		PropertiesTestBean bean=factory.getBean("propertiesbean", PropertiesTestBean.class);
		System.out.println(bean.getValues());
		Assert.assertEquals(2, bean.getValues().size());
	}
	
	
	@Test
	public void testProperties1(){
		BeanFactory factory=new ClassPathXmlApplicationContext("chapter3/listInject.xml");
		PropertiesTestBean bean=factory.getBean("propertiesbean1", PropertiesTestBean.class);
		System.out.println(bean.getValues());
		Assert.assertEquals(4, bean.getValues().size());
	}
	
	

}
