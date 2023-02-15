package com.iu.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s1.util.Pager;

@Service
public class BankbookService {
	
	@Autowired
	private BankbookDAO bankbookDAO;
	
	public List<BankbookDTO> getBankbookList(Pager pager) throws Exception{
		Long totalCount = bankbookDAO.getBankbookCount();
		pager.makeRow();
		pager.makeNum(totalCount);
		return bankbookDAO.getBankbookList(pager);
	}
	
	public BankbookDTO getBankbookDetail(BankbookDTO bankbookDTO) throws Exception {
		return bankbookDAO.getBankbookDetail(bankbookDTO);
	}
	
	public int setBankbookAdd(BankbookDTO bankbookDTO) throws Exception{
		return bankbookDAO.setBankbookAdd(bankbookDTO);
	}
	
	
	public int setBankbookDelete(BankbookDTO bankbookDTO)throws Exception{
		return bankbookDAO.setBankbookDelete(bankbookDTO);
	}

	public int setBankbookUpdate(BankbookDTO bankbookDTO)throws Exception{
		return bankbookDAO.setBankbookUpdate(bankbookDTO);
	}

}
