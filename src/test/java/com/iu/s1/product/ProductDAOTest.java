package com.iu.s1.product;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s1.MyTestCase;

public class ProductDAOTest extends MyTestCase {

	@Autowired
	private ProductDAO productDAO;
	
	@Test
	public void getProductListTest() throws Exception {
		List<ProductDTO> ar = productDAO.getProductList(null);
		//단정문
		assertNotEquals(0, ar.size());
	}
	
	@Test
	public void getProductDetailTest()throws Exception{
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductNum(88L);
		productDTO = productDAO.getProductDetail(productDTO);
		assertNull(productDTO);
	}
	
	//insert
	
	@Test	
	public void setProductAddTest() throws Exception{
		ProductDTO productDTO =new ProductDTO();
		productDTO.setProductNum(40L);
		productDTO.setProductName("TestName2");
		productDTO.setProductDetail("TestDetail2");
		int result = productDAO.setProductAdd(productDTO);
		assertEquals(1, result);
	}
	
	
}
