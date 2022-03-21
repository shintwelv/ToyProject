package com.toyproject.elvin.user.enums;

import lombok.Getter;

@Getter
public enum Religion {
	ATHEIST("무교"),
	PROTENTANTISM("개신교"),
	BUDDHISM("불교"),
	CATHOLICISM("천주교"),
	ISLAM("이슬람교")
	;
	

	private String krName;
	
	Religion(String krName) {
		// TODO Auto-generated constructor stub
		this.krName = krName;
	}
}
