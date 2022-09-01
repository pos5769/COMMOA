package com.kopo.commoa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kopo.commoa.vo.MemberVo;

@Mapper
public interface MemberMapper {
	
	//회원목록
	List<MemberVo> selectMemberList();

}
