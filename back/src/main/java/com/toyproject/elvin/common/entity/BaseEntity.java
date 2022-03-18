package com.toyproject.elvin.common.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

public class BaseEntity {
	@CreatedDate
	private LocalDateTime createdDate;
	@LastModifiedDate
	private LocalDateTime lastModifiedDate;

}
