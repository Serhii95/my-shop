package org.example.myshop.domain.service.impl;

import org.example.myshop.domain.dto.UserDTO;
import org.example.myshop.domain.service.UserService;
import org.example.myshop.persistence.entity.User;
import org.example.myshop.persistence.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class DefaultUserService implements UserService {

	private final UserRepository userRepository;

	public DefaultUserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDTO createUser(UserDTO userDTO) {
		User user = new User(userDTO);

		user.setPassword(userDTO.getPassword());

		return new UserDTO(userRepository.save(user));
	}

	@Override
	public Optional<UserDTO> getUserById(int id) {
		return userRepository.findById(id).map(user -> new UserDTO(user));
	}

}
