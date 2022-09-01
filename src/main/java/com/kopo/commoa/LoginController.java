package com.kopo.commoa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

//EgovLiginController 참고



public class LoginController { // 일반 로그인 처리하는 컨트롤러 클래스
	
	//필요한 서비스 객체 : loginService, userService
	
	
	//로그인 화면으로 진입
	public String loginView(LoginVO loginVO, HttpServletRequest request, HttpServletResponse response, Model model) {
		
		return "";
	}
	
	//로그인 처리
	public String actionLogin(LoginVO loginVO, HttpServletRequest request, HttpServletResponse response, Model model) {
		
		return "";
	}

	//로그아웃 처리
	public String actionLogout(LoginVO loginVO, HttpServletRequest request, HttpServletResponse response, Model model) {
		
		return "";
	}

	//아이디/비밀번호 찾기 화면으로 진입
	
	//아아디 찾기
	
	//비밀번호 찾기(변경)
}
