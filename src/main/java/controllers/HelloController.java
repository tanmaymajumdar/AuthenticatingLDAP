package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Hello")
@RestController
public class HelloController  {
	
	@RequestMapping(value = "hello" , method = RequestMethod.GET)
	public String ping() {
		return "Hello world";
	}

}
