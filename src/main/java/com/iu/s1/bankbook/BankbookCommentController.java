package com.iu.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s1.board.BbsDTO;
import com.iu.s1.board.BbsService;
import com.iu.s1.util.Pager;

@Controller
@RequestMapping(value = "/bankbookComment/*")
public class BankbookCommentController {
	
	@Autowired
	private BbsService bankbookCommentService;
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView getBoardList (Pager pager) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		List<BbsDTO>ar = bankbookCommentService.getBoardList(pager);
		
		mv.addObject("list", ar);
		mv.setViewName("board/list");
		return mv;
	}
	
	
}
