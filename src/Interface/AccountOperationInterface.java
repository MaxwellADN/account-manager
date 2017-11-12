package Interface;

import Entity.Account;
import Entity.User;

public interface AccountOperationInterface {
	
	public boolean withdraw(Account account, float money, int code);
	public boolean deposit(Account account, float money, int code);

}
