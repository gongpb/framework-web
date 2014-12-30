package com.gongpb.jsonlib.bean;


public class UserJsonLib {
	private int id;
    private String name;
    private String email;
    private String birthday;
    private AddressJsonLib address;
    
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

	public AddressJsonLib getAddress() {
		return address;
	}

	public void setAddress(AddressJsonLib address) {
		this.address = address;
	}

}
