package com.abc.learning.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.abc.learning.entity.User;

public class UserDao {
	public static String saveUser(SessionFactory factory, User user) {
		try {
			Session session = factory.getCurrentSession();

			session.beginTransaction();

			session.persist(user);

			session.getTransaction().commit();

			return "User added successfully";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
		return "Error adding user";
	}

	public static List<User> getUserListByQuery(SessionFactory factory, String query) {

		System.out.println();
		List<User> userList = new ArrayList<>();
		try {
			Session session = factory.getCurrentSession();

			session.beginTransaction();

			userList = session.createQuery(query, User.class).getResultList();

			session.getTransaction().commit();

			return userList;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}

		return userList;
	}

	public static User getSingleUserByQuery(SessionFactory factory, String query) {
		try {
			Session session = factory.getCurrentSession();

			session.beginTransaction();

			List<User> users = session.createQuery(query, User.class).getResultList();

			for (User user : users) {
				System.out.println("Fetched User : " + user.toString());
			}

			session.getTransaction().commit();

			return users.get(0);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}

		return null;
	}

	public static User getUserById(SessionFactory factory, int id) {
		try {
			Session session = factory.getCurrentSession();

			session.beginTransaction();

			User user = session.find(User.class, id);

			session.getTransaction().commit();

			return user;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static String updateOrDeleteUserById(SessionFactory factory, String query) {
		try {
			Session session = factory.getCurrentSession();

			session.beginTransaction();

			Query q = session.createQuery(query);
			int result = q.executeUpdate();
			
			session.getTransaction().commit();

			if(result > 0) {
			return "User updated successfully";}
			else {
				return "No records found to update";
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}

		return "User not been updated";
	}

	public static String deleteUserById(SessionFactory factory, int id) {
		try {
			Session session = factory.getCurrentSession();

			session.beginTransaction();

			User user = session.find(User.class, id);

			session.remove(user);

			session.getTransaction().commit();

			return "User deleted successfully";

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
		return "User Delete failed";
	}
	
	public static String deleteUsersByName(SessionFactory factory,String name) {
		try {
			Session session = factory.getCurrentSession();
			
			session.beginTransaction();
			
			Query qu = session.createQuery("DELETE FROM User u WHERE u.name=:name").setParameter("name", name);
			
			int rowCount = qu.executeUpdate();
			session.getTransaction().commit();
			if(rowCount>0) {
				return "Records deleted successfully";
			}else {
				return "No matching records found to delete";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}
		
		return "Error while deleting records";
	}

}
