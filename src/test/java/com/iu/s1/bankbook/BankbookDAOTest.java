package com.iu.s1.bankbook;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s1.MyTestCase;

public class BankbookDAOTest extends MyTestCase {
	
	@Autowired
	private BankbookDAO bankbookDAO;

	@Test
	public void getBankbookListTest() throws Exception {
		List<BankbookDTO>ar = bankbookDAO.getBankbookList();
		assertNotEquals(1, ar.size());
	}
	
	@Test
	public void getBankbookDetailTest() throws Exception{
		BankbookDTO bankbookDTO = new BankbookDTO();
		bankbookDTO.setBookNumber(123L);
		bankbookDTO = bankbookDAO.getBankbookDetail(bankbookDTO);
		assertNull(bankbookDTO);
	}

}
