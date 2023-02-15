package com.iu.s1.product;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s1.util.Pager;

@Controller
@RequestMapping(value = "/product/*")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "list")
	public ModelAndView getProductList(Pager pager) throws Exception {
		ModelAndView mv = new ModelAndView();
		List<ProductDTO> ar = productService.getProductList(pager);
		
		mv.setViewName("product/productList");
		mv.addObject("list", ar);
		mv.addObject("pager", pager);
		return mv;
	}
	
	@RequestMapping(value = "detail")
	public String getProductDetail(ProductDTO productDTO, Model model) throws Exception {
		//파라미터의 이름과 setter의 이름이 같아야 함
		
		System.out.println("product detail 입니다");
		//String num = request.getParameter("num");
		//ProductDTO productDTO = new ProductDTO();
		//productDTO.setProductNum(num);
		
		productDTO = productService.getProductDetail(productDTO);
		
		System.out.println(productDTO != null);
		
		model.addAttribute("dto", productDTO);
		
		return "product/productDetail";
	}
	
	//입력 페이지 이동
	@RequestMapping(value = "productAdd", method = RequestMethod.GET)
	public void setProductAdd() {
		System.out.println("product add 입니다");
		//url 경로와 jps 경로가 같으면 void로 둬도 리턴 알아서 해줌
	}
	
	//입력 페이지 데이터 받는 메서드
	@RequestMapping(value = "productAdd", method = RequestMethod.POST)
	public String setProductAdd(ProductDTO productDTO) throws Exception {
		productService.setProductAdd(productDTO, null);
		return "redirect:./list";
	}
	
	
	
	
	
	@RequestMapping(value = "update")
	public ModelAndView Update() {
		System.out.println("product update입니다");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("product/productUpdate");
		return mv;
	}
	
	
	
	
}
