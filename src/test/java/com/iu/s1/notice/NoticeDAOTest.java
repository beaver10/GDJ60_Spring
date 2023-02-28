package com.iu.s1.notice;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s1.MyTestCase;
import com.iu.s1.board.BbsDTO;
import com.iu.s1.board.notice.NoticeDAO;
import com.iu.s1.board.notice.NoticeDTO;
import com.iu.s1.util.Pager;


public class NoticeDAOTest extends MyTestCase {

	@Autowired
	private NoticeDAO noticeDAO;
	
	//list
	@Test
	public void getBoardListTest() throws Exception {
		Pager pager = new Pager();
		
		pager.makeRow();
		
		List<BbsDTO>ar = noticeDAO.getBoardList(pager);
		assertNotEquals(0, ar.size());
		
	}
	
	@Test
	public void setBoardAddTest() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		
		noticeDTO.setTitle("title1");
		noticeDTO.setWriter("writer1");
		noticeDTO.setContents("contents1");
		
		int result = noticeDAO.setBoardAdd(noticeDTO);
		assertEquals(1, result);
		
	}

}
