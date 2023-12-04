package org.example.myshop.domain.service;

import org.example.myshop.domain.dto.UserDTO;
import org.example.myshop.persistence.entity.User;

import java.util.Optional;

public interface UserService {

	UserDTO createUser(UserDTO userDTO);

	Optional<UserDTO> getUserById(int id);
}
