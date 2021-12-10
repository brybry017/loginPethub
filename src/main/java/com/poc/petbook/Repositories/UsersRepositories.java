package com.poc.petbook.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.poc.petbook.Entities.Users;

public interface UsersRepositories extends MongoRepository<Users, String> {

	@Query(value = "{ $and: [ { 'username' : ?0 }, { 'password' : ?1 } ] }")
	Users findByusernameAndpassword(String username, String password);
}
