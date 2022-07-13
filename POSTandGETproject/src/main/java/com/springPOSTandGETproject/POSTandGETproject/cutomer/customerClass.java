package com.springPOSTandGETproject.POSTandGETproject.cutomer;

public class customerClass {
	
	private String cName;
	private String cAddress;
	private int cIncome;
	private String cNumber;
	
	public customerClass() {
		super();
	}
	
	public customerClass(String cName, String cAddress, int cIncome, String cNumber) {
		this.cName = cName;
		this.cAddress = cAddress;
		this.cIncome = cIncome;
		this.cNumber = cNumber;
	}

	public String getcName() {
		return cName;
	}

	public String getcAddress() {
		return cAddress;
	}

	public int getcIncome() {
		return cIncome;
	}

	public String getcNumber() {
		return cNumber;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public void setcIncome(int cIncome) {
		this.cIncome = cIncome;
	}

	public void setcNumber(String cNumber) {
		this.cNumber = cNumber;
	}
	
	

}
