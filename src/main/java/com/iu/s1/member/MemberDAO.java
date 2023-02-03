package com.iu.s1.member;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public class MemberDAO {
	
	//가입 페이지 이동
	@RequestMapping (value = "join")
	public String memberJoin (MemberDTO memberDTO) {
		return "./member/memberJoin";
		
	}
	
	
	//가입 정보 추가 
	@RequestMapping (value = "join")
	public void memberJoin() {
		
	}

}
