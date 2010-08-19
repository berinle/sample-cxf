package spring;

import javax.jws.WebService;

@WebService
public interface HelloWorld {

	String sayHi(String name);
	int add(int a, int b);
	int subtract(int a, int b);
}
