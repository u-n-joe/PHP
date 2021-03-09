package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//url 요청 종류별 실행할 코드 등록
@Controller
public class MyController {

	@RequestMapping(value = "/") // url만 지정. method 상관 없음
	public String home() {
		return "index";// 뷰 페이지 경로
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET) // url과 method 지정
	public void hello_get() {// @RequestMapping 메서드의 반환값이 void이면 url과 동일한 경로의 뷰 페이지실행

	}

//	@RequestMapping(value="/hello", method=RequestMethod.POST)//url과 method 지정
//	public ModelAndView hello_post(String id, String name) {
//		ModelAndView mav = new ModelAndView("hello_result");//뷰페이지 경로와 뷰페이지에 전달할 데이터 담는 객체
//		mav.addObject("id", id);//뷰 페이지에 전달할 데이터 저장
//		mav.addObject("name", name);
//		return mav;
//	}

	@RequestMapping(value = "/hello", method = RequestMethod.POST) // url과 method 지정
	public String hello_post(@ModelAttribute("v") Vo v) {// 커맨드 객체. 자동으로 뷰페이지에 전달됨(소문자 클래스명:vo)

		return "command";
	}

	@RequestMapping("/test1")
	public void test1(Model m) {
		m.addAttribute("val1", "aaa");
		m.addAttribute("val2", "BBB");
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login_get() {
		return "member/login";
	}

}
