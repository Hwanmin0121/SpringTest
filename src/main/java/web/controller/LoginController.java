package web.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import web.dto.UserVo;


@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	//로거 이름 변경
	
	@RequestMapping(value="/login/login.do", method=RequestMethod.GET)
	public void login() {}
	
	
	@RequestMapping(value="/login/login.do", method=RequestMethod.POST)
	public ModelAndView loginProcess(UserVo userVo,String id,String pw) {
		logger.info("id="+id+ ", pw="+pw);
		logger.info(userVo.toString());
		
		ModelAndView mav = new ModelAndView();
		
		//view에 전달될 Model 설정
		//model.addAttribute("user",userVo);역할
		mav.addObject("user",userVo);
		
		//view name 설정 
		//return "login/result"; 역할
		
		//mav.setViewName("login/result"); //1.forwarding 주소가 안바뀌고 리퀘스트가 유지되기때문에  이방법은 잘 안쓴다. 굳이 보여줄 필요x
		//response.sendRedirect("/login/main.do");역할 
		mav.setViewName("redirect:/login/main.do");
		
		return mav;
		
		
	}
	
	
	/*@RequestMapping(value="/login/login.do", method=RequestMethod.POST)
	public void loginProcess(UserVo userVo,String id,String pw) {
		logger.info("id="+id+ ", pw="+pw);
		logger.info(userVo.toString());
		
		
	}*/
	
	
	@RequestMapping(value="/login/main.do", method=RequestMethod.GET)
	
	public String main() {
		
		logger.info("main method() STARTED");
		
		return "login/main";
	}
	
}
