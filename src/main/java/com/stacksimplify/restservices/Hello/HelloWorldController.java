package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//controller
@RestController
public class HelloWorldController {
	//simple method
	//URI - /helloworld
	//GET
	//Two ways to maps to a endpoint
	
	//@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	@GetMapping("/helloworld1")
	public String helloworld() {
		return "Hello world";
	}
	
	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Kalyan", "Reddy", "Hyderabad");
	}

}
