package de.kutschin.michael.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/v1/hello")
public class HelloWorldController {
	
	@RequestMapping("/{name}")
    public String index(@PathVariable String name) {
        return "Hello " + name + "!";
    }
	
}
