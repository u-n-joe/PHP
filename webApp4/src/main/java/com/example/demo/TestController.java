package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {// 컨트롤러의 주 역할:외부에 노출할 url을 정의하고 이 url로 요청이 왔을때 실행할 코드 정의

	//@RequestMapping:url과 함수 등록. 전송 방식 따지지 않음. 
	@RequestMapping(value = "/index")
	public void index() {
		//return "/WEB-INF/views/index.jsp";//뷰 페이지 경로 반환
		//return "index";//설정파일이 prefix, suffix 등록 뒤.
		//void: 뷰 페이지 경로 반환 안하면. url과 동일한 경로의 뷰 페이지 생성
	}
	/*
	@RequestMapping("/board/writeForm")
	public String writeForm() {
		return "board/write";
	}
	
	@RequestMapping("/board/write")
	public String write(@ModelAttribute("mv") MsgVo mv) {//커맨드 객체는 자동으로 뷰 페이지에 전달됨
		return "index";
	}
	*/
	
//	컨트롤러에서 get/post를 구분하는 이유는 join작업 중에서 폼을 원하는지, 입력내용저장을 원하는지 구분하는 용도.
//	
//	작업이 2단계로 나뉨. 폼을 보여줌. 입력내용저장
//	회원가입-/join - 폼을 보여주는 것은(get), 입력내용저장(post)
//	로그인
//	글쓰기
	
	
	@GetMapping("/board/write")//글작성 폼
	public void writeForm() {
		//return "board/write";
	}
	
	@PostMapping("/board/write")//글작성 완료
	public String write(@ModelAttribute("mv") MsgVo mv) {//커맨드 객체는 자동으로 뷰 페이지에 전달됨
		//db에 담고 redirect로 /list
		return "index";	//redirect로 페이지 이동. 클라이언트가 이 url을 요청
	}
	
	
}
