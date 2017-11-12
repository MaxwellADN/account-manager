package Interface;

import Entity.Account;
import Entity.User;

public interface AccountManagmentInterface {
	
	public boolean addAccount(Account account);
	public boolean updateAccount(Account account,Account newest);
	public boolean deleteAccount(Account account);
	public boolean linkAccountToUser(Account account, User user);
	public boolean findUserAccounts(User user);
	public boolean totalUserAcountBalance(User user);
}
