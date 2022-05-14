import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class homeController {

	@RequestMapping ("/home")
	//1.return type ModelAndView
	public ModelAndView Home(Model mod )
	{
		//2.Create object of ModelAndView
		ModelAndView m=new ModelAndView();
		//3.use method
		m.addObject("username","ALANDI");
		//4.set view
		m.setViewName("index");
		return m;
	}
	@RequestMapping("/register")
	public String login()
	{
		return "register";
	}
	@RequestMapping("/registration")
	public String signin(@RequestParam ("username") String uname , @RequestParam ("password") String pwd ,Model mo) {
		
		if(uname.equals("Keshav") && pwd.equals("12345"))
		{
			mo.addAttribute("username",uname);
		return "success";
		}
		else
		{
			String err="Something went wrong";
			mo.addAttribute("errorr",err);
			return "register";
		}
	}


}
