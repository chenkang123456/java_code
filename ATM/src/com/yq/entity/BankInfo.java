package com.yq.entity;

public class BankInfo {
	private int id;
	private String accountid;
	private String username;
	private String password;
	private String registtime;
	private String age;
	private double banlence;
	
	
	public BankInfo() {
		super();
	}
	
	public BankInfo(String accountid, double banlence) {
		super();
		this.accountid = accountid;
		this.banlence = banlence;
	}

	public BankInfo(String accountid, String password) {
		super();
		this.accountid = accountid;
		this.password = password;
	}
	
	public BankInfo(String accountid, String username, String password, String age,double banlence) {
		super();
		this.accountid = accountid;
		this.username = username;
		this.password = password;
		this.age = age;
	}
	
	public BankInfo(String accountid, String password, double banlence) {
		super();
		this.accountid = accountid;
		this.password = password;
		this.banlence = banlence;
		this.banlence = banlence;
	}
	public BankInfo(int id, String accountid, String username, String password,
			String registtime,String age, double banlence) {
		super();
		this.id = id;
		this.accountid = accountid;
		this.username = username;
		this.password = password;
		this.registtime=registtime;
		this.age = age;
		this.banlence = banlence;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountid() {
		return accountid;
	}
	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRegisttime() {
		return registtime;
	}
	public void setRegisttime(String registtime) {
		this.registtime = registtime;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public double getBanlence() {
		return banlence;
	}
	public void setBalance(double banlence) {
		this.banlence = banlence;
	}
	
}
