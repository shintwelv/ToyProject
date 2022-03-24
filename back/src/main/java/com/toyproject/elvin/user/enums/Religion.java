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
		this.krName = krName;
	}

	public static Religion findValue(String krname) {
		Religion[] values = Religion.values();
		for (Religion religion : values) {
			if (religion.getKrName().equals(krname)) {
				return religion;
			}
		}
		return null;
	}
}
