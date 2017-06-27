package hu.soter.pizzamvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/wellhello")
	public String sayHello() {
		return "hello-world";
	}
}
