package com.toyproject.elvin.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toyproject.elvin.user.dtos.request.CreateAccountRequestDto;
import com.toyproject.elvin.user.dtos.request.SignInRequestDto;
import com.toyproject.elvin.user.dtos.request.SignUpRequestDto;
import com.toyproject.elvin.user.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	@PostMapping("/signIn")
	public ResponseEntity<Boolean> signIn(SignInRequestDto dto) {
		
		userService.signIn(dto);
		
		return ResponseEntity.ok().body(true);
		
	}
	
	@PostMapping("/createAccount")
	public ResponseEntity<Boolean> createAccount(CreateAccountRequestDto dto) {
		
		userService.createAccount(dto);
		
		return ResponseEntity.ok().body(true);
	}
	
	@PostMapping("/signUp")
	public ResponseEntity<Boolean> signUp(SignUpRequestDto dto) {
		
		userService.signUp(dto);
		
		return ResponseEntity.ok(true);
	}

}
