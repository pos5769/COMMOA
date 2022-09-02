package com.kopo.commoa.service;

import java.util.List;

import com.kopo.commoa.vo.MemberVo;

public interface MemberService {
	//회원목록
	List<MemberVo> selectMemberList(); 

}
