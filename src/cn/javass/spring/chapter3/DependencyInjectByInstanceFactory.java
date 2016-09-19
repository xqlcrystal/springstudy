package cn.javass.spring.chapter3;

import java.beans.ConstructorProperties;

import cn.javass.spring.chapter2.helloworld.HelloApi;
import cn.javass.spring.chapter2.helloworld.HelloImpl3;

public class DependencyInjectByInstanceFactory {

	
	public HelloApi newInstance(String msg,int index){
		return new HelloImpl3(msg, index);
	}
}
