package com.spring.ex01; // 애너테이션이 적용되도록 반드시 <component-scan>에서 설정한 패키지나 하위패키지에 존재해야 한다.

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


// 서버 연결하고 http://localhost:8080/pro26/test/main1.do 경로를 크롬창에 실행시킨다
// 주의할 점은 'setViewName = ~.jsp' 의 이름을 일치 시켜야 하고
// '~.jsp'안에 ${} 의 중괄호 안에는 'addObject'의 'key값'과 일치 시켜야 한다.


//@Controller("mainController")  //Controller 애너테이션을 이용해 MainController 클래스를 빈으로 자동변환한다. id는 MainController 이다.
//@RequestMapping("/test")  // RequestMapping애너테이션을 이용해 첫 번째 단계의 URL 요청이 '/test'이면 'mainController' 빈을 요청한다.
public class MainController {

	
	// 첫 번째 연습
	@RequestMapping(value = "/main1.do", method = RequestMethod.GET) //RequestMethod 애너테이션을 이용해 두번 쨰 단계의 URL요청이 ~.do이면 mainController 빈의 main1()메서드에게 요청한다. 
    public ModelAndView aaaa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg1","hi1");
		mav.setViewName("testA"); // view/test/~.jsp 파일과 이름이 일치해야 함!
		return mav;
	}
	
	
	//두 번째 연습
	@RequestMapping(value = "/main2.do", method = RequestMethod.GET) //RequestMethod 애너테이션을 이용해 두번 째 단계의 URL요청이 ~.do이면 mainController 빈의 main1()메서드에게 요청한다. 
    public ModelAndView bbbb(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg2","안녕 hi2");
		mav.setViewName("testB"); // view/test/~.jsp 파일과 이름이 일치해야 함!
		return mav;
	}
}
