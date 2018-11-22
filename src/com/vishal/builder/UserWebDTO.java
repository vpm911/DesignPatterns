package com.vishal.builder;

// A product in the builder pattern
public class UserWebDTO implements UserDTO {
	private String name;
	private String age;
	private String address;
	
	public UserWebDTO(String name, String age, String address) {
		this.name=name;
		this.address=address;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "name: " + this.name + " age: "+this.age + " address: " + this.address;
		
	}
}
