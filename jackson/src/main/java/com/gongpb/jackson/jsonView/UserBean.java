package com.gongpb.jackson.jsonView;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonView;

@JsonAutoDetect(JsonMethod.FIELD)
public class UserBean {
	public interface BaseView {
	};
	public interface FView extends BView{
	};
	public interface BView{
	};
	
	@JsonProperty("ID")
	private int id;
	
	@JsonProperty("USERNAME")
	private String username;
	
	@JsonProperty("PASSWORD")
	private String password;
	
	@JsonView(FView.class)
	@JsonProperty("FPROPERTY")
	private String Fproperty;
	
	@JsonView(BView.class)
	@JsonProperty("BPROPERTY")
	private String Bproperty;

	public UserBean() {
	}

	public UserBean(String username, String password) {
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
