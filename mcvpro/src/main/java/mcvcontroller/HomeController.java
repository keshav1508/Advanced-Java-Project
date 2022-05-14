package mcvcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping ("/home")
	public ModelAndView Home(Model mod)
	{
		ModelAndView m=new ModelAndView();
		m.addObject("username","Alandi");
		m.setViewName("index");
		return m;
		
	}
	
	@RequestMapping ("/register")
	public String login()
	{
		return "register";
	}
	
	@RequestMapping ("/reee")
	public String signup(@RequestParam ("n1") String name ,@RequestParam ("n2") String email,@RequestParam ("n3") String password,@RequestParam ("n4") String reppas,Model m )
	{
		m.addAttribute("n1",name);
		m.addAttribute("n2",email);
		m.addAttribute("n3",password);
		return "sucess";
	}
	
}
