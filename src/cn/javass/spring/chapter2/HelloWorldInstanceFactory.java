package cn.javass.spring.chapter2;

import cn.javass.spring.chapter2.helloworld.HelloApi;
import cn.javass.spring.chapter2.helloworld.HelloImpl2;

public class HelloWorldInstanceFactory {

	public HelloApi newInstance(String msg){
		return new HelloImpl2(msg);
	}
}
