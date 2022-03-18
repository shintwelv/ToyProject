package com.toyproject.elvin.user.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.toyproject.elvin.common.entity.BaseEntity;
import com.toyproject.elvin.user.enums.Gender;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Setter;

@Document
@Getter
@Setter
@ToString
@NoArgsConstructor
public class User extends BaseEntity{
	@Id
	private Long userId;
	
	private String name;
	private String password;
	private String email;
	private String phoneNumber;
	private Gender gender;

}
