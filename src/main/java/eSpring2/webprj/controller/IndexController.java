package eSpring2.webprj.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController{

	@RequestMapping("/index")
	public String myIndex() {
		System.out.println (" index controller start");
		return "index";
	}
	
	@RequestMapping("/help") 
	@ResponseBody
	public String myHelp(HttpServletResponse response) throws IOException{
		return "help1";
	}
	
	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("data"," my spring");
//		mv.setViewName("index");
//		return mv;
//	}
}