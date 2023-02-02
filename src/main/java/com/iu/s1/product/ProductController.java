package com.iu.s1.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/product/*")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "list")
	public String getProductList() throws Exception {
		
		List<ProductDTO> ar = productService.getProductList();
		
		System.out.println(ar.size()>0);
		
		System.out.println("product list 입니다");
		return "product/productList";
	}
	
	@RequestMapping(value = "detail")
	public String getProductDetail() {
		System.out.println("product detail 입니다");
		return "product/productDetail";
	}
	
	@RequestMapping(value = "productAdd")
	public void productAdd() {
		System.out.println("product add 입니다");
		//url 경로와 jps 경로가 같으면 void로 둬도 리턴 알아서 해줌
	}
	
	@RequestMapping(value = "update")
	public ModelAndView Update() {
		System.out.println("product update입니다");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("product/productUpdate");
		return mv;
	}
	
	
	
	
}
