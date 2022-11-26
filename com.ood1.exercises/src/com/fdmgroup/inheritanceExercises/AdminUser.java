package com.fdmgroup.inheritanceExercises;

public class AdminUser extends UserAccount {

	public AdminUser(String username, String fullName) {
		super(username, fullName);
		// TODO Auto-generated constructor stub
	}
	
    @Override
	public void accessWebsite() {
		System.out.println("Accessing website from the admine side");
	}
}
