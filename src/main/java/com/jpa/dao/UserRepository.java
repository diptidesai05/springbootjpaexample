package com.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User1;


public  interface UserRepository extends CrudRepository<User1, Integer> {

	public List<User1> findByuserName(String userName);
	
	@Query("select u FROM User1 u")
	public List<User1> getAlluser();
	
	@Query("select u from User1 u where u.userName =:n and u.id =:i")
	public List<User1> getUsersByName(@Param("n")String userName, @Param("i")int id);
	
	@Query(value="select * from User1", nativeQuery=true)
	public List<User1> getUsers();
}
