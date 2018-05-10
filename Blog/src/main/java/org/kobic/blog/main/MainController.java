package org.kobic.blog.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value = "/")
	public ModelAndView mainView(ModelAndView mv) {
		
		mv.setViewName("/main/main");
		
		return mv;
	}
}
