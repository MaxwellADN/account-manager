package Functionalities;

import Data.AccountData;
import Data.Operation;
import Entity.Account;
import Entity.User;
import Interface.AccountOperationInterface;

public class AccountOperation implements AccountOperationInterface{
	
	AccountData data = new AccountData();

	@Override
	public boolean withdraw(Account account, float money, int code) {
		if (money !=0)
		{
			Operation op = new Operation();
			if (account.getBalance() >= money)
			{
				for (Account a : data.getAccountListArray())
				{
					if (a.getNumber() == account.getNumber())
					{
						a.setBalance(account.getBalance() - money);
						op.setAccount(a);
						System.out.println(money+" has been withdrawn from account "+a.getNumber()+" \n");
						data.getAccountList();
					}
				}
			
				return true;
			}
			else
			{
				System.out.println(money+" could not be withdrawn \n You balance is insufficient");
			}
			
		}
		else 
		{
			System.out.println("You can not withdraw "+money);
		}
		
		return false;
	}

	@Override
	public boolean deposit(Account account,float money, int code) {
		if (money != 0)
		{
			Operation op = new Operation();
			
			for (Account a : data.getAccountListArray())
			{
				if (a.getNumber() == account.getNumber())
				{
					a.setBalance(account.getBalance()+money);
					op.setAccount(a);
					System.out.println(money+" was deposited in account "+a.getNumber()+" \n");
					data.getAccountList();
				}
			}
			
			
			return true;
		}
		return false;
	}

}
