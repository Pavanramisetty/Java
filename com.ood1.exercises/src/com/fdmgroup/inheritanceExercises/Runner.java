package com.fdmgroup.inheritanceExercises;

public class Runner {

	public static void main(String[] args) {
		AdminUser admin1 = new AdminUser("Admin1", "full_Admin1");
		AdminUser admin2 = new AdminUser("Admin2", "full_Admin2");
		
		CustomerUser customer1 = new CustomerUser("Customer1", "full_customer1");
		CustomerUser customer2 = new CustomerUser("Customer2", "full_customer2");
		
		admin1.changePassword("same", "same");
		customer1.changePassword("same", "different");

		
		admin1.accessWebsite();
		
		UserAccountManager manager = new UserAccountManager();
		
		manager.addUser(customer2);
		manager.addUser(customer1);
		manager.addUser(admin1);
		manager.addUser(admin1);

	
		System.out.println(manager.login("Admin1", "same"));
			}

}
