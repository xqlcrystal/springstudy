package cn.javass.spring.chapter3.bean;

import cn.javass.spring.chapter2.helloworld.HelloApi;

public class HelloApiDecorator implements HelloApi {

	private HelloApi helloApi;
	
	public HelloApiDecorator() {
		// TODO Auto-generated constructor stub
	}
	
	public HelloApiDecorator(HelloApi api){
		this.helloApi=api;
	}
	
	public void setHelloApi(HelloApi helloApi) {
		this.helloApi = helloApi;
	}
	@Override
	public void sayHello() {
		System.out.println("==========装饰一下===========");
        helloApi.sayHello();
        System.out.println("==========装饰一下===========");


	}

}
