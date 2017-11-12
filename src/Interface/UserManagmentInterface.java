package Interface;

import Entity.User;

public interface UserManagmentInterface {
	
	public boolean addUser(User user);
	public boolean updateUser(User Old, User New);
	public boolean deleteUser(User user);
}
