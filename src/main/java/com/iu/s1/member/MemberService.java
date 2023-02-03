package com.iu.s1.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;
	
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		
		memberDTO.setId("jhy5");
		memberDTO.setPw("1111");
		memberDTO.setName("장하영");
		memberDTO.setPhone("010-2222-2222");
		memberDTO.setEmail("jhy@naver.com");
		memberDTO.setAddress("서울시");
		
		System.out.println("서비스 넣기 완료");
		
		int result = memberDAO.memberJoin(memberDTO);
		if(result>0) {
			System.out.println(result==1);
		
		}
		return result;
		
	}

}
