package com.fdmgroup.polymorphismExercises;

public class AdminUser extends UserAccount {
	
	private static int minAdminPasswordLength;

	public AdminUser(String username, String fullName) {
		super(username, fullName);
		// TODO Auto-generated constructor stub
	}
	
    @Override
	public void accessWebsite() {
		System.out.println("Accessing website from the admine side");
	}
    
    @Override
    public boolean changePassword(String newPass, String confirmPass) {
    	if (newPass.equals(confirmPass)) {
		  if (newPass.length() + confirmPass.length() >= minAdminPasswordLength) {
			 System.out.println("true");
		  }
		    return true;
		}
		else
			return false;
    }
    
    public boolean changePassword(String newpass, String confirmPass, UserAccount user) {
    	return false;
    }

	public static int getMinAdminPasswordLength() {
		return minAdminPasswordLength;
	}

	public static void setMinAdminPasswordLength(int minAdminPasswordLength) {
		AdminUser.minAdminPasswordLength = minAdminPasswordLength;
	}
    
    
}
