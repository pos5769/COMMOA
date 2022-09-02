package com.kopo.commoa.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kopo.commoa.service.MemberService;
import com.kopo.commoa.vo.MemberVo;



@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	//회원목록
	@GetMapping(path = "/memberList")
	public String list(@ModelAttribute("vo") MemberVo vo, HttpServletRequest req, ModelMap model) throws Exception {	
		List<MemberVo> list = memberService.selectMemberList();  
		model.addAttribute("list", list);
		System.out.println("controller: " + list.size()); 
		return "member/memList";
	}
	
	//회원추가폼
	@GetMapping(path = "/join")
	public String memberInsertForm() throws Exception {
		return "member/memberRegist";
	}
	
	//회원추가하기
	@PostMapping(path = "/join")
	public String memberInsert(MemberVo vo) throws Exception {
		int num = memberService.memberInsert(vo);
		return "redirect:/memberList";
	}
	
	
	
}
