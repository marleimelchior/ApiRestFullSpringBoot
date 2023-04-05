package com.marleimelchior.projectSpringRestFull.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marleimelchior.projectSpringRestFull.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
