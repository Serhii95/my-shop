package org.example.myshop.domain.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.myshop.model.UserData;
import org.example.myshop.persistence.entity.Category;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserDTO extends UserData {
	private Integer id;
	private String firstName;
	private String middleName;
	private String surname;
	private String email;
	private String username;
	private String phoneNumber;
	private String password;
	private Integer age;

	public UserDTO(UserData userData) {
		super(userData);
	}

}
