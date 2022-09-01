package com.kopo.commoa.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kopo.commoa.service.impl.MemberService;
import com.kopo.commoa.vo.MemberVo;



@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	//회원목록
//	@GetMapping(path = "/memberList")
//	public String MemberList() throws Exception {
//		return "home";
//	}
	
	@GetMapping(path = "/memberList")
	public String list(Map<String,Object> map) throws Exception {	
		List<MemberVo> list = memberService.selectMemberList();  
		map.put("memList", list);
		return "member/memList";
	}
	
	//회원추가
	@PostMapping(path = "/join")
	public String Memberinsert() throws Exception {
		
		return "home";
	}
	
	
	
}
