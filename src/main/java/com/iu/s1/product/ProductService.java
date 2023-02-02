package com.iu.s1.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	
	
	
	public ProductDTO getProductDetail(ProductDTO productDTO) throws Exception {
		return productDAO.getProductDetail(productDTO);
	}
	
	
	
	public List<ProductDTO> getProductList() throws Exception{
		return productDAO.getProductList();
		
	}
	
	
	public int setAddProduct (ProductDTO productDTO, List<ProductOptionDTO>ar) throws Exception{
		//product, option 등록
		Long productNum = productDAO.getProductnum();
		productDTO.setProductNum(productNum);
		int result = productDAO.setAddProduct(productDTO);
		
		for(ProductOptionDTO productOptionDTO:ar) {
			productDTO.setProductNum(productNum);
			result = productDAO.setAddProductOption(productOptionDTO);
			
		}
		return result;
		
		
	}

	public static void main(String[] args) {
		
		ProductDAO productDAO = new ProductDAO();
		
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductName("product1");
		productDTO.setProductDetail("detail1");
		
		ProductOptionDTO productOptionDTO = new ProductOptionDTO();
		productOptionDTO.setOptionname("option1");
		productOptionDTO.setOptionPrice(100);
		productOptionDTO.setOptionStock(10);
		productOptionDTO.setProductnum(null);
		
		ProductOptionDTO productOptionDTO2 = new ProductOptionDTO();
		productOptionDTO2.setOptionname("option2");
		productOptionDTO2.setOptionPrice(200);
		productOptionDTO2.setOptionStock(20);
		productOptionDTO2.setProductnum(null);
		
		try {
			Long num = productDAO.getProductnum();
			productDTO.setProductNum(num);
			
			int result = productDAO.setAddProduct(productDTO);
			
			productOptionDTO.setProductnum(num);
			
			if(result>0) {
				productDAO.setAddProductOption(productOptionDTO);
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
