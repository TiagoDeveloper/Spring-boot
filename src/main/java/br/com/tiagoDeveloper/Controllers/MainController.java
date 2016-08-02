package br.com.tiagoDeveloper.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/main")
public class MainController {

	@RequestMapping(method= RequestMethod.GET)
	@ResponseBody
	public String index(){
	    return "Proudly handcrafted by " +
	            "<a href='http://netgloo.com/en'>Netgloo</a> :)";
	}
	
	@RequestMapping(value="teste", method= RequestMethod.GET)
	public String home(){
	    return "demo/teste";
	}
	
}
