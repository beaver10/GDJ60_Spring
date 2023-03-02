//package com.iu.s1.bankbook;
//
//import static org.junit.Assert.*;
//
//import java.util.List;
//import java.util.Random;
//
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.iu.s1.MyTestCase;
//
//public class BankbookDAOTest extends MyTestCase {
//	
//	@Autowired
//	private BankbookDAO bankbookDAO;

//	@Test
//	public void getBankbookListTest() throws Exception {
//		List<BankbookDTO>ar = bankbookDAO.getBankbookList();
//		assertNotEquals(1, ar.size());
//	}
//	
//	@Test
//	public void getBankbookDetailTest() throws Exception{
//		BankbookDTO bankbookDTO = new BankbookDTO();
//		bankbookDTO.setBookNumber(123L);
//		bankbookDTO = bankbookDAO.getBankbookDetail(bankbookDTO);
//		assertNull(bankbookDTO);
//	}
//	
//	@Test
//	public void setBankbookAdd() throws Exception {
//		
//		for(int i=0; i<30; i++) {
//		Random r = new Random();
//		double d = r.nextDouble();
//		int num = (int)(d*1000);
//		d= num/100.0;
//		
//		BankbookDTO bankbookDTO = new BankbookDTO();
//		bankbookDTO.setBookName("우리은행"+i);
//		bankbookDTO.setBookRate(d);
//		bankbookDTO.setBookSale(1);
//		bankbookDTO.setBookDetail("디테일");
//		int result = bankbookDAO.setBankbookAdd(bankbookDTO);
//		}
//		System.out.println("finish");
//	}
	
//	@Test
//	public void setBankbookDelete() throws Exception{
//		BankbookDTO bankbookDTO = new BankbookDTO();
//		bankbookDTO.setBookNumber(22L);
//		int result = bankbookDAO.setBankbookDelete(bankbookDTO);
//		assertEquals(1, result);
//	}

//}
