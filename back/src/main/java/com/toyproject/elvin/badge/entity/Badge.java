package com.toyproject.elvin.badge.entity;

import org.springframework.data.annotation.Id;

import com.toyproject.elvin.badge.enums.ProcessState;
import com.toyproject.elvin.common.entity.BaseEntity;
import com.toyproject.elvin.user.entity.User;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Badge extends BaseEntity{
	@Id
	private Long badgeId;
	private String name;
	private ProcessState state;
	private User user;
	private String rejectReason;
	
}
