package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	//컨트롤러 역할
public class MainController {
	
	@RequestMapping("/main")	//요청이 들어오는 주소 경로 맵핑
	public String main() {
		
		//return String "사용자에게 전달할 view 자원의 경로"
		//return "/WEB-INF/views/abc.jsp";
		return "abc";
	}
	
	@RequestMapping("/")
	public String index() {
		//return "/WEB-INF/views/main.jsp";
		return "main";
	}
}
