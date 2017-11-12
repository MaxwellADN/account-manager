package Functionalities;

import java.util.ArrayList;

import Data.UserData;
import Entity.User;
import Interface.UserManagmentInterface;

public class UserManagment implements UserManagmentInterface {
	private UserData userList = new UserData();
	private ArrayList<User> list;
	
	public UserManagment()
	{
		list = new ArrayList<>();
	}

	@Override
	public boolean addUser(User user) {
	
		if(user != null)
		{	
			userList.setUser(user);
			
			System.out.println(user.getFisrtName()+" "+user.getLastName() + " has been added to user list");
			
			System.out.println("============== User list ==============");
			
			userList.getUserList();
			
			return true;
			
		}
		return false;
		
	}

	@Override
	public boolean updateUser(User oldUser, User user) {
		ArrayList<User> list = userList.getUserListArray();
		
		
		
		if (user != null)
		{
			for (User u : list)
			{
				if (u.getFisrtName() == oldUser.getFisrtName())
				{
					userList.update(u, user);
					
					System.out.println(u.getFisrtName()+" "+u.getLastName() + " has been updated ");
					
					System.out.println("============== User list ==============");
					
					userList.getUserList();
								
					
				}
			}
			return true;
		}
		
		return false;
	}

	@Override
	public boolean deleteUser(User user) {
		ArrayList<User> list = userList.getUserListArray();
		
		for (User u : list)
		{
			if (u.getFisrtName() == user.getFisrtName())
			{
				userList.remove(u);
				
				System.out.println(u.getFisrtName()+" "+u.getLastName() + " has been deleted from user list");
				
				System.out.println("============== User list ==============");
				
				userList.getUserList();
				
				return true;
			}
		}
		return false;
	}
	
	public void showUserList()
	{
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(i+1 + " Fist name : " + list.get(i).getFisrtName());
		}
	}

}
