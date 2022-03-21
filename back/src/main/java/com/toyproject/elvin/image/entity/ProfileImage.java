package com.toyproject.elvin.image.entity;

import com.toyproject.elvin.common.entity.BaseEntity;
import com.toyproject.elvin.user.entity.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ProfileImage extends BaseEntity{
	
	private Long imageId;
	private User user;

}
