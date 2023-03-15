package com.reg.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.reg.entity.User;

@Repository
public interface UserRepository extends JpaRepositoryImplementation<User, Integer> {

	@Query("select u from User u where u.email=?1")
	User checkEmail(String email);
	
	@Query("select u from User u where u.password=?1")
	User checkPass(String pass);
}
