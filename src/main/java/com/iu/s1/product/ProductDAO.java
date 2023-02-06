package com.iu.s1.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.iu.s1.util.DBConnection;

@Repository
public class ProductDAO {
	
	@Autowired
	private SqlSession sqlSession;
	//풀패키지명 끝에 꼭 . 찍기
	private final String NAMESPACE = "com.iu.s1.product.ProductDAO.";
	
	
	//delete--------------------------------------------------------------------
	public int setProductDelete(Long productNum)throws Exception{
		
		Connection con = DBConnection.getConnection();
		
		String sql = "DELETE PRODUCT WHERE PRODUCTNUM =?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, productNum);
		
		int resulut = st.executeUpdate();

		DBConnection.disConnect(st, con);
		
		return resulut;
	}
	
	
	
	//getMax------------------------------------------------------------
	
	public Long getProductnum () throws Exception{
		
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT PRODUCT_SEQ.NEXTVAL M FROM DUAL";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		rs.next();
		Long num = rs.getLong("M");
		
		DBConnection.disConnect(st, con, rs);
		
		return num;
		
	}
	
	
	//Productoption---------------------------------------------------------
	
	public List<ProductOptionDTO> getProductOptionList() throws Exception{
		
		List<ProductOptionDTO> ar = new ArrayList<ProductOptionDTO>();
		
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT * FROM PRODUCTOPTION";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			ProductOptionDTO productOptionDTO = new ProductOptionDTO();
			productOptionDTO.setOptionNum(rs.getLong("OPTIONNUM"));
			productOptionDTO.setProductnum(rs.getLong("PRODUCTNUM"));
			productOptionDTO.setOptionname(rs.getString("OPTIONNAME"));
			productOptionDTO.setOptionPrice(rs.getInt("OPTIONPRICE"));
			productOptionDTO.setOptionStock(rs.getInt("OPTIONSTOCK"));			
		}
		DBConnection.disConnect(st, con, rs);
		return ar;
	}
	
	
	public int setAddProductOption (ProductOptionDTO productOptionDTO) throws Exception {
		
		Connection con = DBConnection.getConnection();
		
		String sql = "INSERT INTO PRODUCTOPTION VALUES (PRODUCTOPTION_SEQ.NEXTVAL, ?, ?, ?, ?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, productOptionDTO.getProductnum());
		st.setString(2, productOptionDTO.getOptionname());
		st.setInt(3, productOptionDTO.getOptionPrice());
		st.setInt(4, productOptionDTO.getOptionStock());

		int result = st.executeUpdate();
		
		DBConnection.disConnect(st, con);
		
		return result;
	}
	
	
	
	//Product-------------------------------------------------------------------------------
	
	public ProductDTO getProductDetail(ProductDTO productDTO) throws Exception{
		//PK 가져올땐 one (namespace + "mapper의 id(메서드명)") , mapper에 파라미터 타입에 선언한 타입과 동일한 타입)
		return sqlSession.selectOne(NAMESPACE+"getProductDetail", productDTO);
	}
	
	
	public List<ProductDTO> getProductList() throws Exception {
		
		return sqlSession.selectList(NAMESPACE+"getProductList");
	}
	
	
	public int setAddProduct(ProductDTO productDTO) throws Exception {
		
		return sqlSession.insert(NAMESPACE+"setAddProduct", productDTO);
	}
	
	
}
