package com.entity;

public class LoginUser {
	private String name;
	private String password;
	private String code;

	LoginUser() {
	}

	LoginUser(String n, String pw) {
		this.name = n;
		this.password = pw;
	}

	LoginUser(String n, String pw, String code) {
		this.name = n;
		this.password = pw;
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
