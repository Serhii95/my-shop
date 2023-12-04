package org.example.myshop.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class UserData {

	public UserData(UserData userData) {
		setId(userData.getId());
		setFirstName(userData.getFirstName());
		setMiddleName(userData.getMiddleName());
		setSurname(userData.getSurname());
		setEmail(userData.getEmail());
		setUsername(userData.getUsername());
		setPhoneNumber(userData.getPhoneNumber());
		setAge(userData.getAge());
	}

	public abstract Integer getId();

	public abstract void setId(Integer id);

	public abstract String getFirstName();

	public abstract void setFirstName(String firstName);

	public abstract String getMiddleName();

	public abstract void setMiddleName(String middleName);

	public abstract String getSurname();

	public abstract void setSurname(String surname);

	public abstract String getEmail();

	public abstract void setEmail(String email);

	public abstract String getUsername();

	public abstract void setUsername(String username);

	public abstract String getPhoneNumber();

	public abstract void setPhoneNumber(String phoneNumber);

	public abstract Integer getAge();

	public abstract void setAge(Integer age);

}
