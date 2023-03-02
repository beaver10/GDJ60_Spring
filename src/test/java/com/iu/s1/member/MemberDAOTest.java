//package com.iu.s1.member;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.iu.s1.MyTestCase;
//import com.iu.s1.product.ProductDAO;
//import com.iu.s1.product.ProductDTO;
//
//public class MemberDAOTest extends MyTestCase{
//	
//	@Autowired
//	private MemberDAO memberDAO;

//	@Test
//	public void memberJoinTest() throws Exception {
//		MemberDTO memberDTO = new MemberDTO();
//		memberDTO.setId("goo");
//		memberDTO.setPw("goo");
//		memberDTO.setMemberName("goo");
//		memberDTO.setMemberPhone("goo");
//		memberDTO.setEmail("goo");
//		int result = memberDAO.memberJoin(memberDTO);
//		assertEquals(1, result);
//				
//	}

//}
