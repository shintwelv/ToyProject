package com.toyproject.elvin.user.service;

import org.springframework.stereotype.Service;

import com.toyproject.elvin.user.dtos.request.SignInRequestDto;
import com.toyproject.elvin.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository userRepo;

	public void signIn(SignInRequestDto dto) {
		String userName = dto.getUserName();
		String password = dto.getPassword();
		
		userRepo.findByNameAndPassword(userName, password);
	}

}
