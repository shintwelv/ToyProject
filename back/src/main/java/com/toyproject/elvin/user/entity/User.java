package com.toyproject.elvin.user.entity;

import java.util.Collection;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.toyproject.elvin.badge.entity.Badge;
import com.toyproject.elvin.common.entity.BaseEntity;
import com.toyproject.elvin.image.entity.ProfileImage;
import com.toyproject.elvin.user.enums.BodyShape;
import com.toyproject.elvin.user.enums.Gender;
import com.toyproject.elvin.user.enums.ProcessState;
import com.toyproject.elvin.user.enums.Religion;
import com.toyproject.elvin.user.enums.SignUpType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
	private Integer cash;
	private List<String> characters;
	private List<String> dateTypes;
	private List<String> dreamTypes;
	@DBRef
	private Collection<ProfileImage> profileImages;
	@DBRef
	private Collection<Badge> badges;
	private Religion religion;
	private Integer height;
	private BodyShape bodyShape;
	private String job;
	private Region region;
	private Float rating;
	private SignUpType signUpType;
	private ProcessState state;
	

}
