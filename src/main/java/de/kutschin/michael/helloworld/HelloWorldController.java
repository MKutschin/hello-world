package de.kutschin.michael.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class HelloWorldController {
	
	@RequestMapping("/world")
    public String index() {
        return "Hello World!";
    }
	
}
