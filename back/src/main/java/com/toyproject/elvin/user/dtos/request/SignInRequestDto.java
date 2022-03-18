package com.toyproject.elvin.user.dtos.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SignInRequestDto {
	
	private String userName;
	private String password;

}
