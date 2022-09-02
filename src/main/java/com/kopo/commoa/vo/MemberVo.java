package com.kopo.commoa.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberVo {
	
	//고유ID
	private String mngMemId;
	
	//회원ID
	private String memId;
	
	//비밀번호
	private String memPassword;
	
	//이름
	private String name;
	
	//이메일주소
	private String email;
	
	//전화번호
	private String phone;

	//최초가입일
	private Date registFrstDate;
	
	//우편번호
	private String zipCode;

	//집주소
	private String address;
	
	//비밀번호힌트
	private String pwHint;

	//비밀번호힌트답
	private String pwAns;
	
}
