package hu.soter.pizzamvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/wellhello")
	public String sayHello(@RequestParam("name") String name, Model model) {
		model.addAttribute("jspname", name);
		
		return "hello-world";
	}
}
