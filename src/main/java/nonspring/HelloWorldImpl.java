package nonspring;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.jws.WebService;

//see http://svn.apache.org/repos/asf/cxf/trunk/distribution/src/main/release/samples/java_first_jaxws/src/demo/hw/

@WebService(name="HelloWorld", endpointInterface="nonspring.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
	Map<Integer, User> users = new LinkedHashMap<Integer, User>();
	
	/*@Override
	public Map<Integer, User> getUsers() {
		System.out.println("getUsers called.");
		return users;
	}*/

	@Override
	public String sayHi(String name) {
		System.out.println("sayHi called.");
		return "Hello " + name;
	}

	@Override
	public String sayHiToUser(User user) {
		System.out.println("sayHiToUser called.");
		users.put(users.size()+1, user);
		return "Hello " + user.getName();
	}

}
