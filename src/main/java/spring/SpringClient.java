package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClient {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:client.xml");
		HelloWorld client = (HelloWorld) ctx.getBean("helloClient");
		System.out.println(client.sayHi("Dupe"));
		System.out.println(client.add(3, 4));
		System.out.println(client.subtract(5, 2));
	}
}
