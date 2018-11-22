package com.vishal.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {
	
	// methods to build parts of the product.
	UserDTOBuilder withFirstName(String firstName);
	UserDTOBuilder withLastname(String lastName);
	UserDTOBuilder withBirthday(LocalDate birthday);
	UserDTOBuilder withAddress(Address address);
	
	// method to "assemble" the final product.
	UserDTO build();
	
	// method to fetch already built object.
	UserDTO getUserDTO();
}
