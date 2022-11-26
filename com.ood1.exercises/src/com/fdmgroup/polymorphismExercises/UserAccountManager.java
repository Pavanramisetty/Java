package com.fdmgroup.polymorphismExercises;

import java.util.ArrayList;

public class UserAccountManager {

	ArrayList<UserAccount> accountList = new ArrayList<>();

    public void addUser(UserAccount user) {
    	accountList.add(user);
    }
    
    public boolean login(String username, String password) {
    	for(UserAccount user : accountList) {
    		if ((user.getUsername().equals(username)) && user.getPassword().equals(password))
    			return true;
    	}
    	return false;
    }
}
