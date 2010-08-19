package nonspring;

import java.util.Map;

import javax.jws.WebService;

@WebService
public interface HelloWorld {

	String sayHi(String name);
	String sayHiToUser(User user);
	//Map<Integer, User> getUsers();
}
