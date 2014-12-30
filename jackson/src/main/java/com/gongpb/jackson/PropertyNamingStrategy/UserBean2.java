package com.gongpb.jackson.PropertyNamingStrategy;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonMethod;

@JsonAutoDetect(JsonMethod.FIELD)

public class UserBean2 {
	private int id;
	private String username;
	private String password;
	private String Fproperty;
	private String Bproperty;

	public UserBean2() {
	}

	public UserBean2(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFproperty() {
		return Fproperty;
	}

	public void setFproperty(String fproperty) {
		Fproperty = fproperty;
	}

	public String getBproperty() {
		return Bproperty;
	}

	public void setBproperty(String bproperty) {
		Bproperty = bproperty;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
