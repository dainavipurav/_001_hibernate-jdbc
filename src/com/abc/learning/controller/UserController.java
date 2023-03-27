package com.abc.learning.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.abc.learning.dao.UserDao;
import com.abc.learning.entity.User;

public class UserController {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class)
				.buildSessionFactory();

//		To get all users
//		List<User> userList = UserDao.getUserListByQuery(factory, "FROM User");
//		System.out.println("All User List : ");
//		for (User user : userList) {
//			System.out.println(user.toString());
//		}

//		To insert user
//		User user = new User("Ismail K","US",36,"182409805397209","Male");
//		String result = UserDao.saveUser(factory, user);
//		System.out.println("Save User : "+ result);

//		To get single user by query
//		String query = "FROM User WHERE country = 'India'";
//		User user = UserDao.getSingleUserByQuery(factory, query);
//		System.out.println("Fetched First User : "+user);

//		To get single User by id
//		int id = 11;
//		System.out.println("Fetched User : " + UserDao.getUserById(factory, id));

//		To delete user by id
//		int id = 11;
//		System.out.println(UserDao.deleteUserById(factory, id));

//		To delete multiple users by name
//		String name = "dainavi";
//		System.out.println(UserDao.deleteUsersByName(factory, name));

//		To update user by query
//		String query = "UPDATE User SET name = 'Dainavi Purav' WHERE name = 'Abhay Gavandi'";
//		String query = "DELETE FROM User u WHERE u.name='Dainavi Purav'";
//		System.out.println(UserDao.updateOrDeleteUserById(factory, query));

	}

}
