package com.spring.ex02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//@Controller("loginController2") //서블릿과 비슷한 개념으로 충돌발생하니까 안쓰면 막아놔야 함 
public class LoginController2 {

	@RequestMapping(value = {"/loginForm.do","/loginForm2.do"}, method = RequestMethod.GET)
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("loginForm2");
		return mav;
	}
	
	
	// @RequestParam 적용 시 required 속성을 생략하면 기본값은 true임.
	// required 속성을 true로 설정하면 메서드 호출 시 반드시 지정한 이름의 매개변수를 전달해야 함(매개변수가 없으면 예외 발생!)
	// required 속성을 false로 설정하면 메서드 호출시 지정한 이름의 매개변수가 전달되면 값을 저장하고 없으면 null을 할당 함.
	
	@RequestMapping(value = "/test/login2.do")
	ModelAndView login2(@RequestParam(value = "email", required = false) String email, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("result2");
		
		mav.addObject("email", email);
		return mav;
	}	
	
}
