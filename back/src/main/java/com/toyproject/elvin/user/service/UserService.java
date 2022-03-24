package com.toyproject.elvin.user.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.toyproject.elvin.user.dtos.request.CreateAccountRequestDto;
import com.toyproject.elvin.user.dtos.request.SignInRequestDto;
import com.toyproject.elvin.user.dtos.request.SignUpRequestDto;
import com.toyproject.elvin.user.dtos.request.SignUpRequestDto.BadgeRequest;
import com.toyproject.elvin.user.entity.User;
import com.toyproject.elvin.user.enums.Gender;
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

	public void signUp(SignUpRequestDto dto) {
		Long userId = dto.getUserId();
		
		List<MultipartFile> profileImages = dto.getProfileImages();
		List<BadgeRequest> badges = dto.getBadges();

		User user = userRepo.findById(userId).orElseThrow(() -> new NoSuchElementException("this user doesn't exist!"));
		
		// upload image
		
		
		userRepo.save(user.addRegisterInfo(user, dto));
	}

	public void createAccount(CreateAccountRequestDto dto) {
		String email = dto.getEmail();
		String password = dto.getPassword();
		String phoneNumber = dto.getPhoneNumber();
		String name = dto.getName();
		Gender gender = dto.getGender();
		
		User newUser = new User(name, password, email, phoneNumber, gender);
		
		userRepo.save(newUser);
	}

}
