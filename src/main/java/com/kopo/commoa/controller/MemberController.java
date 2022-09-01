package com.kopo.commoa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	//회원목록
	@GetMapping(path = "/memberList")
	public String MemberList() throws Exception {
		
		return null;
	}
	
	//회원추가
	@PostMapping(path = "/join")
	public String Memberinsert() throws Exception {
		
		return null;
	}
	
	
	
}
