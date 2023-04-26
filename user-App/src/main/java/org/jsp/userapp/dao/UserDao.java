package org.jsp.userapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.jsp.userapp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository  //it is the alternative name of @component now spring container handel the object
public class UserDao {
	@Autowired // inject the dependency // it is searching to qualifiying bean since Entity manager is interface spring don't create 
	              //the bean so we need to create configuration class inside Entity manager bean
	EntityManager manager;
	
	public User saveUser(User user) {
		
	  EntityTransaction transaction=manager.getTransaction();
	   manager.persist(user);
	   transaction.begin();
	   transaction.commit();
		return user;
		
		
	}
	public User updateUser(User user) {
		return user;
		
	}
	public boolean deleteUser(int id) {
		return false;
		
	}
	public User getUserbyid(int id) {
		return null;
		
	}
	public List<List> findAllUsers(){
		return null;
		
	}
	public User verifyUser(long phone,String name) {
		return null;
		
		
	}

}
