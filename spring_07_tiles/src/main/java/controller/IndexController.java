package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// http://localhost:8090/myapp/index.do

@Controller
public class IndexController {
	
	@RequestMapping("/index.do")
	public String execute(){
		return "index"; 
		//title.xml에 있는 definition name="index"임
	}//end execute()
}//end class
