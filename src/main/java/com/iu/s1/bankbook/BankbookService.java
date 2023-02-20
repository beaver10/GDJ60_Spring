package com.iu.s1.bankbook;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.s1.util.FileManager;
import com.iu.s1.util.Pager;

@Service
public class BankbookService {
	
	@Autowired
	private BankbookDAO bankbookDAO;
	
	//testCase 테스트시 Null이 들어옴
	//API 추가해야함
	@Autowired
	private ServletContext servletContext;
	
	@Autowired
	private FileManager fileManager;
	
	public List<BankbookDTO> getBankbookList(Pager pager) throws Exception{
		Long totalCount = bankbookDAO.getBankbookCount(pager);
		pager.makeRow();
		pager.makeNum(totalCount);
		return bankbookDAO.getBankbookList(pager);
	}
	
	public BankbookDTO getBankbookDetail(BankbookDTO bankbookDTO) throws Exception {
		return bankbookDAO.getBankbookDetail(bankbookDTO);
	}
	
	public int setBankbookAdd(BankbookDTO bankbookDTO, MultipartFile pic) throws Exception{
		int result = bankbookDAO.setBankbookAdd(bankbookDTO);
		
		//사진 없는 빈파일이 생기지 않게하는 if절
		if(!pic.isEmpty()) { //if(pic.getSize()!=0) {
			//1. file을 HDD에 저장 경로
			// Project 경로가 아닌 OS가 이용하는 경로
			String realPath = servletContext.getRealPath("resources/upload/bankbook");
			System.out.println(realPath);
			String fileName = fileManager.fileSave(pic, realPath);
			
			//2. DB에 저장
			BankbookImgDTO bankbookImgDTO = new BankbookImgDTO();
			bankbookImgDTO.setFileName(fileName);
			bankbookImgDTO.setOriName(pic.getOriginalFilename());
			bankbookImgDTO.setBookNumber(bankbookDTO.getBookNumber());
			
			result =  bankbookDAO.setBankbookImgAdd(bankbookImgDTO);
		}
		
		return result;// bankbookDAO.setBankbookAdd(bankbookDTO);
	}
	
	
	public int setBankbookDelete(BankbookDTO bankbookDTO)throws Exception{
		return bankbookDAO.setBankbookDelete(bankbookDTO);
	}

	public int setBankbookUpdate(BankbookDTO bankbookDTO)throws Exception{
		return bankbookDAO.setBankbookUpdate(bankbookDTO);
	}
	

}
