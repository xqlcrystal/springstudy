package cn.javass.spring.chapter2.helloworld;

public class HelloImpl2 implements HelloApi {

	private String message;
	
	public HelloImpl2() {
		this.message="Hello world!";
	}
	
	public HelloImpl2(String msg){
		this.message=msg;
	}
	
	@Override
	public void sayHello() {
		System.out.println(message);

	}

}
