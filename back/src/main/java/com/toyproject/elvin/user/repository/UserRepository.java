package com.toyproject.elvin.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.toyproject.elvin.user.entity.User;

public interface UserRepository extends MongoRepository<User, Long>{

	User findByNameAndPassword(String userName, String password);
}
