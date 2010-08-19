package nonspring;

import javax.xml.ws.Endpoint;

public class NonSpringServer {
	public static void main(String[] args) {
		System.out.println("Starting server...");
		HelloWorldImpl hello = new HelloWorldImpl();
		String address = "http://localhost:7890/helloWorld";
		Endpoint.publish(address, hello);
	}
}
