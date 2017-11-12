package Data;

import java.util.ArrayList;
import Entity.User;

public class UserData {
	
	private ArrayList<User> userList;
			
	public UserData() {
		
		this.userList = new ArrayList<User>();
		
		User user1 = new User();
		user1.setFisrtName("John");
		user1.setLastName("Doe");
		user1.setAge(30);
		user1.setAddress("Address");
		user1.setPhone("01 01 01 01 01");
		setUser(user1);
		
		User user2 = new User();
		user2.setFisrtName("Jane");
		user2.setLastName("Doe");
		user2.setAge(25);
		user2.setAddress("Address");
		user2.setPhone("01 01 01 01 01");
		setUser(user2);
		
		User user3 = new User();
		user3.setFisrtName("Alexandre");
		user3.setLastName("Wayde");
		user3.setAge(20);
		user3.setAddress("Address");
		user3.setPhone("01 01 01 01 01");
		setUser(user3);
		
		User user4 = new User();
		user4.setFisrtName("Johnathan");
		user4.setLastName("James");
		user4.setAge(30);
		user4.setAddress("Address");
		user4.setPhone("01 01 01 01 01");
		setUser(user4);
		
		User user5 = new User();
		user5.setFisrtName("Jenifer");
		user5.setLastName("Mark");
		user5.setAge(25);
		user5.setAddress("Address");
		user5.setPhone("01 01 01 01 01");
		setUser(user5);
		
		User user6 = new User();
		user6.setFisrtName("Marcus");
		user6.setLastName("Wayne");
		user6.setAge(20);
		user6.setAddress("Address");
		user6.setPhone("01 01 01 01 01");
		setUser(user6);
						
	}

	public void getUserList()
	{
		
		for (int i = 0; i< userList.size(); i++)
		{
			System.out.println(userList.get(i).getFisrtName()+" "+userList.get(i).getLastName());
		}
		System.out.println("====================================== \n");
		
	}

	public void setUser(User user)
	{
		if (user != null)
		{
			userList.add(user);
		}
	}

	public void remove(User user) {
		userList.remove(userList.indexOf(user));		
	}
	
	public ArrayList<User> getUserListArray()
	{
		return userList;
	}

	public void update(User oldUser, User user) {
		
		User u = userList.get(userList.indexOf(oldUser));
		u.setFisrtName(user.getFisrtName());
		u.setLastName(user.getLastName());
		u.setPhone(user.getPhone());
		u.setAddress(user.getAddress());
		u.setAge(user.getAge());
		
	}

}
