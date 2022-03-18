package com.toyproject.elvin.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.toyproject.elvin.user.dtos.request.SignInRequestDto;
import com.toyproject.elvin.user.service.UserService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/toy")
@RequiredArgsConstructor
public class UserController {
	
	private final UserService userService;
	
	public ResponseEntity<Boolean> signIn(SignInRequestDto dto) {
		
		userService.signIn(dto);
		
		return ResponseEntity.ok().body(true);
		
	}

}
