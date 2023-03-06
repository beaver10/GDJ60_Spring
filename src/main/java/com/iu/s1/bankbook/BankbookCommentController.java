package com.iu.s1.bankbook;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s1.board.BbsDTO;
import com.iu.s1.board.BbsService;
import com.iu.s1.member.MemberDTO;
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
		mv.setViewName("common/commentList");
		return mv;
	}
	
	@PostMapping("add")
	public ModelAndView setBoardAdd(BankbookCommentDTO bankbookCommentDTO, HttpSession session) throws Exception{
		ModelAndView mv = new ModelAndView();
		MemberDTO memberDTO = (MemberDTO) session.getAttribute("member");
		bankbookCommentDTO.setWriter(memberDTO.getId());
		//bankbookCommentDTO.setWriter("ha1");
		int result = bankbookCommentService.setBoardAdd(bankbookCommentDTO, null, session);
		
		mv.addObject("result", result);
		mv.setViewName("common/ajaxResult");
		
		return mv;
	}
	
	@PostMapping("delete")
	public ModelAndView setBoardDelete (BankbookCommentDTO bankbookCommentDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		int result = bankbookCommentService.setBoardDelete(bankbookCommentDTO, null);
		
		mv.addObject("result", result);
		mv.setViewName("common/ajaxResult");
		
		return mv;
		
	}
	
	@PostMapping("update")
	public ModelAndView setBoardUpdate (BankbookCommentDTO bankbookCommentDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		int result = bankbookCommentService.setBoardUpdate(bankbookCommentDTO);
		
		mv.addObject("result", result);
		mv.setViewName("common/ajaxResult");
		
		return mv;
		
	}
	
	
}
