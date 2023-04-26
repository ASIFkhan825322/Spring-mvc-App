package org.jsp.usermvcapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.usermvcapp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
@SuppressWarnings("all")
public class UserDao {
@Autowired
	EntityManager em;
	
	public User saveUser(User user) {
		EntityTransaction et=em.getTransaction();
		em.persist(user);
		et.begin();
		et.commit();
		return user;
		
	}
	public User updateUser(User user) {
		EntityTransaction et=em.getTransaction();
		em.merge(user);
		et.begin();
		et.commit();
		return user;
		
	}
	public User getUserById(int id) {
		
		return em.find(User.class,id);
		
	}
	public boolean deleteUser(int id) {
		User u =em.find(User.class, id);
		if(u !=null) {
			EntityTransaction et=em.getTransaction();
			em.remove(u);
			et.begin();
			et.commit();
			return true;
		}
		return false;
		
	}
	public List<User> findAllUsers(){
		Query q=em.createQuery("select u from User u");
		return q.getResultList();
		
	}
	public User verifyUser(long phone,String password) {
		Query q=em.createQuery("select u from User u where u.phone=?1 and u.password=?2");
		q.setParameter(1, phone);
		q.setParameter(2, password);
		List<User> users=q.getResultList();
		if(users.size()>0) {
			return users.get(0);
		}
		return null;
		
	}
	
	


}
	



