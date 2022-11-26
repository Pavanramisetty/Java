package com.FDM.BookstoreTests;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.bookstore.data.UserArrayListRepository;
import com.fdmgroup.bookstore.model.Book;
import com.fdmgroup.bookstore.model.Order;
import com.fdmgroup.bookstore.model.User;


public class UserArrayListRepositoryTest {

	    User user;
	    User user1;
	    User user2;
	    User newUser;
	    Book book;
	    Order order;
	    UserArrayListRepository userRepo;
	    List<User> userList;
		
		@Before
		public void init() {
			user = new User();
			user1 = new User();
			user2 = new User();
			newUser = new User();
			
			book = new Book();
			order = new Order();
			
			user.setFirstName("pavan");
			user.setLastName("Last Name");
			user.setUserId(1);
			user.setPassword("password");
			user.setUserName("PavanRamisetty");
			
			user1.setFirstName("pavan1");
			user1.setLastName("LastName");
			user1.setUserId(2);
			user1.setPassword("password1");
			user1.setUserName("PavanRamisetty1");
			
			user2.setFirstName("pavan2");
			user2.setLastName("LastName");
			user2.setUserId(3);
			user2.setPassword("password2");
			user2.setUserName("PavanRamisetty2");

			userList = new ArrayList<>();
			userList.add(user);
			userList.add(user1);
			userList.add(user2);
			
			userRepo = new UserArrayListRepository(userList);
		}
		
		@Test
		public void testUserArrayListRepository() {

			assertEquals(userList, userRepo.getUsers());
		}
		
		@Test
		public void testValidateUser() {
			String username = "PavanRamisetty";
			String password = "password";
			boolean result = userRepo.validate(username, password); 
			assertTrue(result);
		}
		
		@Test
		public void testfindUserByUserName() {
			String finduserByUsername = "PavanRamisetty2";
			User result = userRepo.findByUsername(finduserByUsername);
			assertEquals("pavan2", result.getFirstName());	
		}
		
		@Test
		public void testSaveUser() {
	        newUser.setUserName("newuser");
			User savedUser = userRepo.save(newUser);
			assertEquals(newUser, savedUser);
		}
		
		@Test
		public void testDeleteUser() {
			newUser.setUserName("newuser");
			User deleteUser = userRepo.delete(newUser);
			assertEquals(newUser, deleteUser);		
		}
		
		@Test
		public void generateId() {
			int currentId = 1;
			assertEquals(currentId+1, userRepo.generateId());	
		}
		
		@Test
		public void testFindUserById() {
			int userid = 1;
			User result = userRepo.findById(userid);
			assertEquals("pavan", result.getFirstName());		
		}
		
		@Test
		public void testfindAllUsers() {
			assertEquals(userList, userRepo.findAll());
        }
}

	

