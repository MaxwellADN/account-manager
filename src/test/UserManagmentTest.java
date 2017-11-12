package test;

import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.Test;

import Data.AccountData;
import Data.UserData;
import Entity.User;
import Functionalities.UserManagment;

class UserManagmentTest {
	
	UserManagment userManagment = new UserManagment();
	
	
	@Test
	public final void addUserTest()
	{
		User user = new User();
		user.setFisrtName("Lebron");
		user.setLastName("James");
		user.setAge(30);
		user.setAddress("Address");
		user.setPhone("01 01 01 01 01");
		
		assertTrue("User is not added",userManagment.addUser(user));
		
	}

	@Test
	public final void deleteUserTest()
	{
		User user = new User();
		user.setFisrtName("Marcus");
		
		assertTrue("User is not deleted",userManagment.deleteUser(user));
	}
	
	@Test 
	public final void updateUserTest()
	{
					
		User old = new User();
		old.setFisrtName("Jenifer");
		
		User user1 = new User();
		user1.setFisrtName("Steph");
		user1.setLastName("Howard");
		user1.setAge(40);
		user1.setAddress("Address");
		
		assertTrue("User is not updated",userManagment.updateUser(old,user1));
	}

}
