package com.iu.s1.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/member/*")
public class MemberController {
	

	@Autowired
	private MemberService memberService;

	@RequestMapping (value = "memberJoin", method = RequestMethod.GET)
	public ModelAndView memberJoin() throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/member/memberJoin");
		return mv;
	}

	
	@RequestMapping (value = "memberJoin", method = RequestMethod.POST)
	public ModelAndView memberJoin(MemberDTO memberDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = memberService.memberJoin(memberDTO);
		mv.setViewName("redirect:../");
		return mv;
	}
	
	
	
	
	
	
	@RequestMapping(value = "memberLogin")
	public void memberLogin() {
		System.out.println("member login 입니다");
	}
	
	@RequestMapping(value = "page")
	public ModelAndView memberPage() {
		ModelAndView mv = new ModelAndView();
		System.out.println("member page 입니다");
		mv.setViewName("member/memberPage");
		return mv;
	}
}
