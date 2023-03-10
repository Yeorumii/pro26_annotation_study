package com.spring.ex02;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//@Controller("loginController4") //서블릿과 비슷한 개념으로 충돌발생하니까 안쓰면 막아놔야 함 
public class LoginController4 {
	
	// http://localhost:8080/pro26/loginForm3.do

	@RequestMapping(value = {"/loginForm4.do"}, method = RequestMethod.GET)
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("loginForm4");
		return mav;
	}
	
	// 메서드 매개변수 또는 매서드 반환 값을 웹 보기에 노출어있는 명명된 모델 속성에 바인딩 하는 주석입니다.
	// Annotation that binds a method parameter 
	// or method return value to a named 
	// model attribute, exposed to a web view
//	@RequestMapping(value = {"/test/login4.do"}, method = {RequestMethod.GET, RequestMethod.POST})
//	public ModelAndView login4 (@ModelAttribute ("loginVO") LoginVO loginVO, 
//			HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("result4");
//		
//		String userID = loginVO.getUserID();
//		System.out.println(userID);
//		
//		mav.addObject("loginVO", loginVO);
//		return mav;
//	}
	
	
	
	@RequestMapping(value = {"/test/login4.do"}, method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView login4 (@ModelAttribute ("loginVO") LoginVO loginVO, 
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("result4");
		
		String userID = loginVO.getUserID();
		System.out.println(userID);
		
//		mav.addObject("loginVO", loginVO);
		return mav;
	}
}
