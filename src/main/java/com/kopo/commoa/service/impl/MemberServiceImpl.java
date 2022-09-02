package com.kopo.commoa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kopo.commoa.mapper.MemberMapper;
import com.kopo.commoa.service.MemberService;
import com.kopo.commoa.vo.MemberVo;

import utl.SHA256;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired   
	private MemberMapper memberMapper;
	
	@Override
	public List<MemberVo> selectMemberList() {
		return memberMapper.selectMemberList();
	}
	
	//회원추가
	@Override
	public int memberInsert(MemberVo vo) {
		
		//비밀번호 암호화하기
		String sha256 = SHA256.getSHA256(vo.getMemPassword());
		 
		//암호화된 비밀번호로 설정
		vo.setMemPassword(sha256); 
		
		return memberMapper.memberInsert(vo); 
	}

}
