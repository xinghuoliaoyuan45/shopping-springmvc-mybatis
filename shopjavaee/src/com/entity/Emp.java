package com.entity;

public class Emp {
	private String empId;
	private String empName;
	private String empSex;
	private String empOld;
	private String empOne;
	private String empPhone;
	private String empPrice;

	public Emp() {
	}

	public Emp(String empId, String empName, String empPrice) {
		this.empId = empId;
		this.empName = empName;
		this.empPrice = empPrice;
	}

	public Emp(String empId, String empName, String empSex, String empOld,
			String empOne, String empPhone, String empPrice) {
		this.empId = empId;
		this.empName = empName;
		this.empSex = empSex;
		this.empOld = empOld;
		this.empOne = empOne;
		this.empPhone = empPhone;
		this.empPrice = empPrice;
	}

	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpSex() {
		return this.empSex;
	}

	public void setEmpSex(String empSex) {
		this.empSex = empSex;
	}

	public String getEmpOld() {
		return this.empOld;
	}

	public void setEmpOld(String empOld) {
		this.empOld = empOld;
	}

	public String getEmpOne() {
		return this.empOne;
	}

	public void setEmpOne(String empOne) {
		this.empOne = empOne;
	}

	public String getEmpPhone() {
		return this.empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpPrice() {
		return this.empPrice;
	}

	public void setEmpPrice(String empPrice) {
		this.empPrice = empPrice;
	}
}
