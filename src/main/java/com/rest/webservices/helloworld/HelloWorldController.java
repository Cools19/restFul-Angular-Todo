package com.rest.webservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
	
//	@RequestMapping(method = RequestMethod.GET,path="/helloworld")
	@GetMapping(path="/helloworld")
	public String helloworld() {
		return "Hello-World changes occured";
		
	}
	
	@GetMapping(path="/helloworld-bean")
	public HelloWorldBean helloworldBean() {
//		throw new RuntimeException("Some Error has Happened !! Contsct to concered team");
	return new HelloWorldBean("Hello World changed");
	}
	
	//%s replace the name what ever you enter in name coloum
	@GetMapping(path="/helloworld/path-variable/{name}")
	public HelloWorldBean helloworldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}

}
