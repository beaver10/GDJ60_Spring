package com.iu.s1.bankbook;

public class BankbookDTO {
	
	private Long bookNumber;
	private String bookName;
	private Double bookRate;
	private Integer bookSale;
	private String bookDetail;
	private BankbookImgDTO bankbookImgDTO;
	
	
	
	public BankbookImgDTO getBankbookImgDTO() {
		return bankbookImgDTO;
	}
	public void setBankbookImgDTO(BankbookImgDTO bankbookImgDTO) {
		this.bankbookImgDTO = bankbookImgDTO;
	}
	public Long getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(Long bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getBookRate() {
		return bookRate;
	}
	public void setBookRate(Double bookRate) {
		this.bookRate = bookRate;
	}
	public Integer getBookSale() {
		if(bookSale==null||bookSale!=1) {
			this.bookSale=0;
		}
		return bookSale;
	}
	public void setBookSale(Integer bookSale) {
		this.bookSale = bookSale;
	}
	public String getBookDetail() {
		return bookDetail;
	}
	public void setBookDetail(String bookDetail) {
		this.bookDetail = bookDetail;
	}

}
