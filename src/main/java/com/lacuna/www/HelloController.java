package com.lacuna.www;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller //3.어노테이션을 붙여줘야 bean으로써 등록이 된다. 
public class HelloController {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);// logger 타입 설정
	
	@RequestMapping(value="/hello.do",method=RequestMethod.GET)
	public void hello() {
			//1.String으로 반환 타입을 설정 하지 않더라도 void 일 경우 자동으로 멤핑값으로 넘겨주게 된다. 그리고 /value에 꼭!! ="/" 이거 앞에 붙여야된다.
		//2.logger를 쓸려면 logger 타입의 변수를 설정해줘야된다. logger팩토리로 
		logger.info("hello.do 실행됨"); //4. info 설정
		
	}
}
