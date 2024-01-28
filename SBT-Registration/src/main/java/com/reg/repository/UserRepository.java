package com.reg.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.reg.entity.User;

@Repository
public interface UserRepository extends JpaRepositoryImplementation<User, Long> {

	@Query("from User u where u.email =:email")
	User checkEmail(String email);
	
	@Query("select u from User u where u.password= :pass")
	User checkPass(String pass);
}
