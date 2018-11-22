package com.vishal.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder{

	private String firstName;
	private String lastName;
	private String age;
	private String address;
	private UserWebDTO dto ;
	
	@Override
	public UserDTOBuilder withFirstName(String firstName) {
		this.firstName=firstName;
		return this;
	}

	@Override
	public UserDTOBuilder withLastname(String lastName) {
		this.lastName=lastName;
		return this;
	}

	@Override
	public UserDTOBuilder withBirthday(LocalDate birthday) {
		Period ageInYears = Period.between(birthday, LocalDate.now());
		age = Integer.toString(ageInYears.getYears());
		return this;
	}

	@Override
	public UserDTOBuilder withAddress(Address address) {
		this.address = address.getHouseNum() + ' ' + address.getStreet() +  ' ' + address.getCity();
		return this;
	}

	@Override
	public UserDTO build() {
		dto = new UserWebDTO(this.firstName + ' ' +this.lastName, age,address);
		return dto;
	}

	@Override
	public UserDTO getUserDTO() {
		return dto;
	}

}
