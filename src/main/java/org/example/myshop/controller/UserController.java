package org.example.myshop.controller;

import org.example.myshop.domain.dto.UserDTO;
import org.example.myshop.domain.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("users")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	@ResponseBody
	public UserDTO getUser(@RequestParam int id) {
		return userService.getUserById(id).orElse(null);
	}

	@PostMapping
	public void createUser(@RequestBody UserDTO user) {
		userService.createUser(user);
	}
}
