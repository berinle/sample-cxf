import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import spring.HelloWorld;

class GroovyClient{
	static main(a){
		def factory = new JaxWsProxyFactoryBean()
		
		factory.address = "http://localhost:8080/sample-cxf/HelloWorld"
		factory.serviceClass = HelloWorld.class
		
		def hello = factory.create()
		println hello.sayHi("Groovy4Ever")
		println hello.add(10,10)
		println hello.subtract(1,10)		
	}
}