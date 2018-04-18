package com.lacuna.www;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HiController {
	
	@RequestMapping(value="/home/hi.do", method=RequestMethod.GET)
	public String hi(Model model) {
		System.out.println("hi.do 요청되었음!!");
		model.addAttribute("test", "Apple");// 전달되는 값은 키와 벨류로 되는데 속성값으로 전달해준다. 
		/*request.addAttridute("test","Apple");*/
		
		return null;
		//return null "home/hi"; 로 되어있는거나 마찬가지 
		
	}
}
