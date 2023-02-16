package com.iu.s1.bankbook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s1.util.Pager;

@Repository
public class BankbookDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE ="com.iu.s1.bankbook.BankbookDAO.";
	
	
	public Long getBankbookCount(Pager pager) {
		return sqlSession.selectOne(NAMESPACE+"getBankbookCount", pager);
	}
	
	
	//select
	public List<BankbookDTO> getBankbookList(Pager pager) throws Exception{
		return sqlSession.selectList(NAMESPACE+"getBankbookList", pager);
	}
	
	//select
	public BankbookDTO getBankbookDetail(BankbookDTO bankbookDTO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getBankbookDetail", bankbookDTO);
	}
	
	
	//insert
	public int setBankbookAdd(BankbookDTO bankbookDTO)throws Exception {
		return sqlSession.insert(NAMESPACE+"setBankbookAdd", bankbookDTO);
	}
	
	
	//delete
	public int setBankbookDelete(BankbookDTO bankbookDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"setBankbookDelete", bankbookDTO);
	}
	
	//update
	public int setBankbookUpdate(BankbookDTO bankbookDTO)throws Exception {
		return sqlSession.update(NAMESPACE+"setBankbookUpdate", bankbookDTO);
	}
	

}
