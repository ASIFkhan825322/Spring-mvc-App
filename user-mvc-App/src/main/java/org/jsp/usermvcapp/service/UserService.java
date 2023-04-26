package org.jsp.usermvcapp.service;

import java.util.List;

import org.jsp.usermvcapp.dao.UserDao;
import org.jsp.usermvcapp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	public UserDao dao;

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
		return dao.getUserById(id);

	}

	public List<User> findAllUsers() {
		return dao.findAllUsers();

	}

	public User verifyUser(long phone, String password) {
		return dao.verifyUser(phone, password);

	}

}
