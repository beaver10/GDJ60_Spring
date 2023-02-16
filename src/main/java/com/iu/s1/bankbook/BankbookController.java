package com.iu.s1.bankbook;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s1.product.ProductDTO;
import com.iu.s1.util.Pager;

@Controller
@RequestMapping (value = "/bankbook/*")
public class BankbookController {
	
	@Autowired
	private BankbookService bankbookService;
	
	//list
	@RequestMapping (value = "list", method = RequestMethod.GET)
	public ModelAndView getBankbookList(Pager pager)throws Exception{
		ModelAndView mv = new ModelAndView();
		
		List<BankbookDTO> ar = bankbookService.getBankbookList(pager);
		
		mv.setViewName("bankbook/list");
		mv.addObject("list", ar);
		mv.addObject("pager", pager);
		return mv;
	}
	
	//detail
	@RequestMapping (value = "detail", method = RequestMethod.GET)
	public ModelAndView getBankbookDetail(ModelAndView mv, BankbookDTO bankbookDTO)throws Exception{
		bankbookDTO = bankbookService.getBankbookDetail(bankbookDTO);
		mv.setViewName("bankbook/detail");
		mv.addObject("dto", bankbookDTO);
		
		return mv;
	}
	
	//add 페이지 이동
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public ModelAndView setBankbookAdd(ModelAndView mv) {
		mv.setViewName("bankbook/add");
		return mv;
	}
	
	//add DB insert
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView setBankbookAdd(BankbookDTO bankbookDTO, MultipartFile pic, HttpSession session) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		System.out.println("Name : "+pic.getName());
		System.out.println("Ori Name : "+pic.getOriginalFilename());
		System.out.println("size : "+pic.getSize());
		System.out.println(session.getServletContext());
		
		int result = bankbookService.setBankbookAdd(bankbookDTO, pic);
		
		mv.setViewName("redirect: ./list");
		return mv;
	}
	
	//delete
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public ModelAndView setBankbookDelete(BankbookDTO bankbookDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = bankbookService.setBankbookDelete(bankbookDTO);
		mv.setViewName("redirect: ./list");
		return mv;
	}
	
	//update 페이지 이동
	@RequestMapping (value = "update", method = RequestMethod.GET)
	public ModelAndView setBankbookUpdate(BankbookDTO bankbookDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		bankbookDTO = bankbookService.getBankbookDetail(bankbookDTO);
		mv.setViewName("bankbook/update");
		mv.addObject("dto",bankbookDTO);
		return mv;
	}
	
	//update DB 수정
	@RequestMapping (value = "update", method = RequestMethod.POST)
	public ModelAndView setBankbookUpdate(BankbookDTO bankbookDTO, ModelAndView mv) throws Exception {
		int result = bankbookService.setBankbookUpdate(bankbookDTO);
		mv.setViewName("redirect: ./list");
		return mv;
		
	}

}
