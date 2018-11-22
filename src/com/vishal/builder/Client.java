package com.vishal.builder;

import java.time.LocalDate;

public class Client {
	public static void main(String[] args) {
		
		User user = createUser();
		UserDTOBuilder builder = new UserWebDTOBuilder();
		UserDTO dto = directorBuild(builder,user);
		System.out.println(dto.toString());
	}
	
	public static User createUser() {
		User user = new User();
		user.setFirstName("Vishal");
		user.setLastName("Maradkar");
		user.setBirthday(LocalDate.of(1993,9,22));
		user.setAddress(new Address("101","Vista Residency","Pune"));
		return user;
	}
	
	private static UserDTO directorBuild(UserDTOBuilder builder,User user) {
		return builder
			.withFirstName(user.getFirstName())
			.withAddress(user.getAddress())
			.withBirthday(user.getBirthday())
			.withLastname(user.getLastName())
			.build();
	}

}
