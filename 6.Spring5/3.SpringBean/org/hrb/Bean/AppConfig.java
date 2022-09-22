package org.hrb.Bean;

import org.hrb.cars.CorollaB;
import org.hrb.cars.SwiftB;
import org.hrb.specs.V6b;
import org.hrb.specs.V8b;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

 // @Bean annotation.
 // in Spring bean concept , all components are brought under AppConfig class.
 // here we create method in name of class.
 // we can remove @Component annotation after adding property here with @Bean


@Configuration
@ComponentScan("org.hrb")
public class AppConfig {
	
	// return type is object of class
	
	// public <className as return type> <class name in small> (){
	// retrun new < object of class >;
	
	@Bean("corollaB")
	public CorollaB corollaB() {
		return new CorollaB();
	}
	
	@Bean("swiftB")
	public SwiftB swiftB() {
		return new SwiftB();
	}
	
	@Bean("V6Engineb")
	public V6b vb6() {
		return new V6b();
	}
	
	@Bean("V8Engineb")
	public V8b v8b() {
		return new V8b();
	}
	
}