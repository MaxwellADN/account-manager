package Functionalities;

import Data.AccountData;
import Entity.Account;
import Entity.User;
import Interface.AccountManagmentInterface;

public class AccountManagment implements AccountManagmentInterface {
	AccountData data = new AccountData();
	
	@Override
	public boolean addAccount(Account account) {
		if (account != null)
		{
			data.setAccount(account);
			data.getAccountList();
			return true;
		}
		return false;
	}

	@Override
	public boolean updateAccount(Account old, Account newest) {
		if (newest != null)
		{
			for (Account a : data.getAccountListArray())
			{
				if (a.getNumber() == newest.getNumber())
				{
					data.updateAccount(a,newest);
					System.out.println(a.getLibelle()+" "+a.getNumber() + " has been updated ");
					
					System.out.println("============== Account list ==============");
					
					data.getAccountList();
				}
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteAccount(Account account) {
		if (account != null)
		{
			data.deleteAccount(account);
			data.getAccountList();
			return true;
		}
		return false;
	}

	@Override
	public boolean linkAccountToUser(Account account, User user) {
		if (account != null && user != null)
		{
			data.linkUser(account,user);
			System.out.println(user.getFisrtName()+" "+ user.getLastName()+" is link to account "+account.getNumber()+"\n");
			data.getAccountList();
			return true;
		}
		return false;
	}

	@Override
	public boolean findUserAccounts(User user) {
		if (user != null)
		{
			System.out.println("User '"+user.getLastName() +"' account list :");
			for (int i = 0; i<data.getAccountListArray().size(); i++)
			{
				Account a = data.getAccountListArray().get(i);
				
				if (a.getUser().getFisrtName() == user.getFisrtName())
				{
					
					System.out.println("Account name: "+a.getLibelle() + " - account number: "
							+ a.getNumber()+ " balance: "+a.getBalance()+" - user: "+a.getUser().getLastName());
					
				}
			}
			return true;
		}
		return false;
	}
	
	@Override
	public boolean totalUserAcountBalance(User user) {
		if (user != null)
		{
			float result =0;
			System.out.println("User '"+user.getLastName() +"' total account balance :");
			for (int i = 0; i<data.getAccountListArray().size(); i++)
			{
				Account a = data.getAccountListArray().get(i);
				
				if (a.getUser().getFisrtName() == user.getFisrtName())
				{
					result +=a.getBalance();
					
				}
				
			}
			System.out.println(result+"\n");
			return true;
			
		}
		return false;
	}
	

}
