package com.spring.ex02;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//@Controller("loginController3") //서블릿과 비슷한 개념으로 충돌발생하니까 안쓰면 막아놔야 함 
public class LoginController3 {
	
	// http://localhost:8080/pro26/loginForm3.do

	@RequestMapping(value = {"/loginForm3.do"}, method = RequestMethod.GET)
	public ModelAndView loginForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("loginForm3");
		return mav;
		
	}
	
	
	@RequestMapping(value = "/test/login3.do", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView login3(@RequestParam Map<String, String> info,
			                   HttpServletRequest request, HttpServletResponse response) 
			                   throws Exception {
		request.setCharacterEncoding("utf-8");
		
		ModelAndView mav = new ModelAndView();

		
		System.out.println(info);
		String userID = info.get("userID");
		String userName = info.get("userName");

		System.out.println(userID);
		System.out.println(userName);
		
		mav.addObject("info", info);
		mav.setViewName("result3");

		return mav;
	}
}