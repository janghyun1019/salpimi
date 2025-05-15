package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

	@RequestMapping("/notice")
	public String notice() {
		
		return "board/notice";
		///WEB-INF/views/  board/notice      .jsp
	}
}
