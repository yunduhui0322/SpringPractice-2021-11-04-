package webprj.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController{

	@RequestMapping("index")
	@ResponseBody
	public String index(HttpServletResponse response) {
		
		return "Hello index";
	}
	/*
	 * @Override public ModelAndView handleRequest(HttpServletRequest request,
	 * HttpServletResponse response) throws Exception { // TODO Auto-generated
	 * method stub System.out.println("indexCon"); ModelAndView mv = new
	 * ModelAndView(); mv.addObject("data","hello Spring MVC");
	 * mv.setViewName("root.index"); return mv; }
	 */

}
