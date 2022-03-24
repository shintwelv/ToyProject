package com.toyproject.elvin.image.entity;

import com.toyproject.elvin.image.enums.ProcessState;
import com.toyproject.elvin.user.entity.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ProfileImage extends Image{
	
	private Long imageId;
	private User user;
	private Boolean deleted;
	private Integer order;
	private ProcessState state;
	private String rejectReasion;

}
