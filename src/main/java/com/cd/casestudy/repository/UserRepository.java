package com.cd.casestudy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cd.casestudy.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query("select u from User u where u.customerId=:customer_id and u.password=:password")
	List<User> loginCredentials(@Param("customer_id")long customer_id,@Param("password")String password);
}
