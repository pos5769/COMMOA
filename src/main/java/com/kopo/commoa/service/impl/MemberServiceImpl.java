package com.kopo.commoa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kopo.commoa.mapper.MemberMapper;
import com.kopo.commoa.service.MemberService;
import com.kopo.commoa.vo.MemberVo;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired   
	private MemberMapper memberMapper;
	
	@Override
	public List<MemberVo> selectMemberList() {
		return memberMapper.selectMemberList();
	}

}
