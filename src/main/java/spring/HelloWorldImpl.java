package spring;

import javax.jws.WebService;

@WebService(endpointInterface="spring.HelloWorld", name="HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public int add(int a, int b) {
		System.out.println("called add()");
		return a + b;
	}

	@Override
	public String sayHi(String name) {
		System.out.println("called sayHi()");
		return "Greetings " + name + "!";
	}

	@Override
	public int subtract(int a, int b) {
		System.out.println("called subtract()");
		return a - b;
	}

}
