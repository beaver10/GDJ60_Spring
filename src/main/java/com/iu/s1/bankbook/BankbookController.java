package com.iu.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s1.product.ProductDTO;

@Controller
@RequestMapping (value = "/bankbook/*")
public class BankbookController {
	
	@Autowired
	private BankbookService bankbookService;
	
	//list
	@RequestMapping (value = "list", method = RequestMethod.GET)
	public ModelAndView getBankbookList()throws Exception{
		ModelAndView mv = new ModelAndView();
		List<BankbookDTO> ar = bankbookService.getBankbookList();
		mv.setViewName("bankbook/list");
		mv.addObject("list", ar);
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
	public ModelAndView setBankbookAdd(BankbookDTO bankbookDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = bankbookService.setBankbookAdd(bankbookDTO);
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
