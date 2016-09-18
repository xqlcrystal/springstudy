package cn.javass.spring.chapter2.helloworld;

import java.beans.ConstructorProperties;

public class HelloImpl3 implements HelloApi {

	private String message;
	private int index;
	
	@ConstructorProperties({"message","index"})
	public HelloImpl3(String msg,int index) {
		this.message=msg;
		this.index=index;
	}
	
	@Override
	public void sayHello() {
		System.out.println(index+":"+message);
	}

}
