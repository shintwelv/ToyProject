package com.toyproject.elvin.user.dtos.request;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.toyproject.elvin.user.entity.Region;
import com.toyproject.elvin.user.enums.SignUpType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class SignUpRequestDto {
	private Long userId;
	
	private List<String> characters;
	private List<String> dateTypes;
	private List<String> dreamTypes;
	private List<MultipartFile> profileImages;
	private List<BadgeRequest> badges;
	private String religion;
	private Integer height;
	private String bodyShape;
	private String job;
	private Region region;
	private SignUpType signUpType;
	
	@Getter
	@ToString
	public class BadgeRequest {
		private String badgeName;
		private List<MultipartFile> badgeImages;
	}
}
