package com.toyproject.elvin.user.enums;

import lombok.Getter;

@Getter
public enum BodyShape {
	SLIM("슬림한"),
	MEDIUM("보통"),
	FAT("통통한")
	;

	private String krName;

	BodyShape(String krName) {
		this.krName= krName;
	}
	
}
