package com.stacksimplify.restservices.Hello;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
//controller
@RestController
public class HelloWorldController {
	
	@Autowired
	private ResourceBundleMessageSource messageSource;
	//simple method
	//URI - /helloworld
	//GET
	//Two ways to maps to a endpoint
	
	//@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	@GetMapping("/hello/world1")
	public String helloworld() {
		return "Hello world";
	}
	
	@GetMapping("/hello/world-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Kalyan", "Reddy", "Hyderabad");
	}
	
	@GetMapping("/hello/-int")
	public String getMessagesInI18nFormat(@RequestHeader (name= "Accept-Language", required=false) String locale) {
		return messageSource.getMessage("label.hello", null, new Locale(locale));
	}
	
	@GetMapping("/hello/-int2")
	public String getMessagesInI18nFormat2(@RequestHeader (name= "Accept-Language", required=false) String locale) {
		return messageSource.getMessage("label.hello", null, LocaleContextHolder.getLocale());
	}

}
