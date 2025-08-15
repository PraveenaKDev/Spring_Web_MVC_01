package in.praveena.controller;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/greet")
	public ModelAndView greetMsg(){
		ModelAndView mView=new ModelAndView();
		mView.addObject("msg","Welcome to the world of spring web mvc");
		mView.setViewName("index");
		return mView;
		
	}
	
	@GetMapping("/Hi")
	public String sayHi() {
		return "Hi!This is a test method to check the functionality of controller";
	}
	
	@GetMapping("/welcome")
	public String welcomeMsg(Model model) {
		model.addAttribute("msg","This is an alternate way of sending the response using Model object");
		return "index";
	}
	

}
