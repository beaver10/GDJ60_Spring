package com.iu.s1.interceptors;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class MemberCheckInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// controller 진입전 (들어갈때)
		// return이 true라면 다음 controller로 진행
		// return이 false라면 다음 controller로 진행 X
		System.out.println("memberCheck 입니다");
		
		Object obj = request.getSession().getAttribute("member");
		
		if(obj !=null) { 
			return true;
		}
		System.out.println("로그인 안한 경우");
		
		///////////////////////////////////////////////
//		//1.forward로 JSP를 찾아가게하는 방법
//		request.setAttribute("result", "권한이 없습니다");
//		request.setAttribute("url", "../member/memberLogin");
//		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/common/result.jsp");
//		view.forward(request, response);
		
		///////////////////////////////////////////////
		//2.redirect
		response.sendRedirect("../../../../member/memberLogin");
		
		return false;
	}
	
	
	
//	@Override
//	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
//			ModelAndView modelAndView) throws Exception {
//		// controller에서 리턴 후 DS 전 (나올때)
//		System.out.println("controller에서 리턴 후 DS 진입 전");
//	}
//	
//	@Override
//	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
//			throws Exception {
//		// JSP 랜더링 후
//		System.out.println("JSP 랜더링이 종료된 후");
//	}
	
	
	
}
