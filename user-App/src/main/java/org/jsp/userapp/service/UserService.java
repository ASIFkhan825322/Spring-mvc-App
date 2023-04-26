package org.jsp.userapp.service;

import java.util.List;


import org.jsp.userapp.dao.UserDao;
import org.jsp.userapp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
	@Autowired
	public UserDao dao ;
	
	public User saveUser(User user) {
			return dao.saveUser(user);
			
			
		}
		public User updateUser(User user) {
			return dao.updateUser(user);
			
		}
		public boolean deleteUser(int id) {
			return dao.deleteUser(id);
			
		}
		public User getUserbyid(int id) {
			return dao.getUserbyid(id);
			
		}
		public List<List> findAllUsers(){
			return dao.findAllUsers();
			
		}
		public User verifyUser(long phone,String name) {
			return verifyUser(phone, name);
			
			
		}

}
