package nonspring;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;


public class NonSpringClient {
	public static void main(String[] args) {
		
		//Low level way of accessing...
		/*Service svc = Service.create(new QName("http://nonspring/", "HelloWorld"));
		svc.addPort(new QName("http://nonspring/", "HelloWorldPort"), SOAPBinding.SOAP11HTTP_BINDING, "http://localhost:7890/helloWorld");
		HelloWorld port = svc.getPort(HelloWorld.class);
		System.out.println(port.sayHi("John"));
		User user = new User();
		user.setName("Quincy");
		System.out.println(port.sayHiToUser(user));*/
		
		//Using jaxws factory bean...
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(HelloWorld.class);
		factory.setAddress("http://localhost:7890/helloWorld");
		HelloWorld port = (HelloWorld) factory.create();
		System.out.println(port.sayHi("John"));
		User user = new User();
		user.setName("Quincy");
		System.out.println(port.sayHiToUser(user));
	}
}
