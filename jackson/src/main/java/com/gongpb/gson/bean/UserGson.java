package com.gongpb.gson.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class UserGson {
	@SerializedName("ID")
	private int id;
	@SerializedName("NAME")
    private String name;
    @Expose 
    @SerializedName("EMAIL")
    private String email;
    @SerializedName("BIRTHDAY")
    private String birthday;
    @SerializedName("ADDRESS")
    private AdressGson address;
    
    //getter、setter
    
    @Override
    public String toString() {
        return this.name + "#" + this.id + "#" + this.address + "#" + this.birthday + "#" + this.email +"#"+birthday.toString();
    }
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public AdressGson getAddress() {
		return address;
	}

	public void setAddress(AdressGson address) {
		this.address = address;
	}

}
