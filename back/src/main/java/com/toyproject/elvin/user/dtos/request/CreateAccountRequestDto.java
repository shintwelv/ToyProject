package com.toyproject.elvin.user.dtos.request;

import com.toyproject.elvin.user.enums.Gender;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CreateAccountRequestDto {
	
	private String email;
	private String password;
	private String phoneNumber;
	private Gender gender;
	private String name;

}
