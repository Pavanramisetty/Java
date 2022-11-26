package com.fdmgroup.inheritanceExercises;

public class CustomerUser extends UserAccount {


	public CustomerUser(String username, String fullName) {
		super(username, fullName);
	}
	
    @Override
	public void accessWebsite() {
		System.out.println("Accessing website from the custmer side");
	}
}
