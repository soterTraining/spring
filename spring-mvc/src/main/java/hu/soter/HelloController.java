package hu.soter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Hello Soter, Hello Spring MVC");
		
		return "hello";
	}
}
