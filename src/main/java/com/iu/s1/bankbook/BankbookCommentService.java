package com.iu.s1.bankbook;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s1.board.BbsDAO;
import com.iu.s1.board.BbsDTO;
import com.iu.s1.board.BbsService;
import com.iu.s1.util.Pager;

@Service
public class BankbookCommentService implements BbsService {

	@Autowired
	private BbsDAO bankbookCommentDAO;
	//private BankbookCommentDAO bankbookCommentDAO;
	
	
	@Override
	public List<BbsDTO> getBoardList(Pager pager) throws Exception {
		pager.makeRow();
		
		pager.makeNum(bankbookCommentDAO.getTotalCount(pager));
		
		return bankbookCommentDAO.getBoardList(pager);
	}



	@Override
	public int setBoardUpdate(BbsDTO bbsDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setBoardDelete(BbsDTO bbsDTO, HttpSession httpSession) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
