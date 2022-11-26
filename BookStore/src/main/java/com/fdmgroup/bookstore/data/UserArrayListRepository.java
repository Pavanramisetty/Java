package com.fdmgroup.bookstore.data;

import java.util.List;

import com.fdmgroup.bookstore.model.User;

public class UserArrayListRepository implements UserRepository, Persistable, Removable, Searchable {
	private List<User> users;
	public static int id = 1;
	public static int generateId;
	
	public UserArrayListRepository(List<User> users) {
		super();
		this.users = users;
	}
    
	public UserArrayListRepository() {
		super();
	}

	@Override
	public boolean validate(String username, String password) {
		for(User user : users) {
        	if (username.equals(user.getUserName()) && password.equals(user.getPassword())) {
        		return true;
        	}
        }
		return false;
	}
	
	public User findByUsername(String username) {
		for (User user : users) {
			if (username.equals(user.getUserName())) {
			    return user;
			}
		}
		return null;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public static int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGenerateId() {
		return generateId;
	}

	public void setGenerateId(int generateId) {
		this.generateId = generateId;
	}
	
	public static int generateId() {
		int exstingId = getId();
		generateId = exstingId + 1;
		return generateId;
		
	}

	@Override
	public User delete(User user) {
		users.remove(user);
		return user;
	}

	@Override
	public User save(User user) {
		users.add(user);
		return user;
	}

	@Override
	public User findById(int id) {
		for (User user: users) {
			if (id == user.getUserId()) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> findAll() {
		return users;
	} 
}
