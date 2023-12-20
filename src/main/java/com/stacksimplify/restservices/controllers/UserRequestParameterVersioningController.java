package com.stacksimplify.restservices.controllers;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stacksimplify.restservices.dtos.UserDtoV1;
import com.stacksimplify.restservices.dtos.UserDtoV2;
import com.stacksimplify.restservices.entities.User;
import com.stacksimplify.restservices.exceptions.UserNotFoundException;
import com.stacksimplify.restservices.services.UserService;

import jakarta.validation.constraints.Min;

@RestController
@RequestMapping("/versioning/params/users")
public class UserRequestParameterVersioningController {

	@Autowired
	private UserService userService;

	@Autowired
	private ModelMapper modelMapper;

	// Request Parameter based Versioning - V1
	// getUserById Method
	@GetMapping(value = "/{id}", params = "version=1")
	public UserDtoV1 getUserById(@PathVariable("id") @Min(1) Long id) throws UserNotFoundException {

		Optional<User> userOptional = userService.getUserById(id);

		if (!userOptional.isPresent()) {
			throw new UserNotFoundException("user not found");
		}

		User user = userOptional.get();

		UserDtoV1 UserDtoV1 = modelMapper.map(user, UserDtoV1.class);
		return UserDtoV1;

	}

	// Request Parameter based Versioning - V2
	// getUserById Method
	@GetMapping(value = "/{id}", params = "version=2")
	public UserDtoV2 getUserById2(@PathVariable("id") @Min(1) Long id) throws UserNotFoundException {

		Optional<User> userOptional = userService.getUserById(id);

		if (!userOptional.isPresent()) {
			throw new UserNotFoundException("user not found");
		}

		User user = userOptional.get();

		UserDtoV2 UserDtoV2 = modelMapper.map(user, UserDtoV2.class);
		return UserDtoV2;

	}

}
