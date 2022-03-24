package com.toyproject.elvin.user.entity;

import java.util.Collection;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.toyproject.elvin.badge.entity.Badge;
import com.toyproject.elvin.common.entity.BaseEntity;
import com.toyproject.elvin.image.entity.ProfileImage;
import com.toyproject.elvin.user.dtos.request.SignUpRequestDto;
import com.toyproject.elvin.user.enums.BodyShape;
import com.toyproject.elvin.user.enums.Gender;
import com.toyproject.elvin.user.enums.ProcessState;
import com.toyproject.elvin.user.enums.Religion;
import com.toyproject.elvin.user.enums.SignUpType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Builder
@AllArgsConstructor
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
	
	public User(String name, String password, String email, String phoneNumber, Gender gender) {
		this.name = name;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		
		this.rating = 0.0F;
		this.cash = 0;
	}
	
	public User addRegisterInfo(User user, SignUpRequestDto dto) {
		List<String> characters = dto.getCharacters();
		List<String> dateTypes = dto.getDateTypes();
		List<String> dreamTypes = dto.getDreamTypes();
		Religion religion = Religion.findValue(dto.getReligion());
		Integer height = dto.getHeight();
		BodyShape bodyShape =BodyShape.findValue(dto.getBodyShape());
		String job = dto.getJob();
		Region region = dto.getRegion();
		SignUpType signUpType = dto.getSignUpType();
		ProcessState state = ProcessState.UNDER_EXAMINATION;
		
		user.setCharacters(characters);
		user.setDateTypes(dateTypes);
		user.setDreamTypes(dreamTypes);
		user.setReligion(religion);
		user.setHeight(height);
		user.setBodyShape(bodyShape);
		user.setJob(job);
		user.setRegion(region);
		user.setSignUpType(signUpType);
		user.setState(state);
		return user;
	}
	
	
	
	
}
