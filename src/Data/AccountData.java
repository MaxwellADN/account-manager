package Data;

import java.util.ArrayList;
import java.util.Date;

import Entity.Account;
import Entity.User;

public class AccountData {
	
	ArrayList<Account> accountList;
	
	public AccountData()
	{
		 accountList = new ArrayList<>();
		
		Account account = new Account();
		account.setLibelle("Current Account");
		account.setNumber(123456);
		account.setCreationDate(new Date());
		account.setCode(1212);
		account.setBalance(1000);
		
		UserData userData = new UserData();
		User user = userData.getUserListArray().get(0);
		
		account.setUser(user);
		
		accountList.add(account);
		
		Account account1 = new Account();
		account1.setLibelle("Saving Account");
		account1.setNumber(123457);
		account1.setCreationDate(new Date());
		account1.setCode(1313);
		account1.setBalance(300);
		
		
		User user1 = userData.getUserListArray().get(0);
		account1.setUser(user1);
		
		accountList.add(account1);
		
		Account account2 = new Account();
		account2.setLibelle("Pro Account");
		account2.setNumber(123454);
		account2.setCreationDate(new Date());
		account2.setCode(1414);
		account2.setBalance(5000);
		
		User user2 = userData.getUserListArray().get(2);
		account2.setUser(user2);
		
		accountList.add(account2);
		
		
	}
	
	public void getAccountList()
	{
		System.out.println("============== Account List ===============");
		for (Account account : accountList)
		{
			System.out.println("Account name: "+account.getLibelle() + " - account number: "
					+ account.getNumber()+ " balance: "+account.getBalance()+" - user: "+account.getUser().getLastName());
		}
		System.out.println("============================================ \n");
	}
	
	public void setAccount(Account account)
	{
		accountList.add(account);
		
		System.out.println("account : "+account.getLibelle() + " - number: " 
		+ account.getNumber()+ " balaance: "+account.getBalance()+ " is added");
	}
	
	public void updateAccount(Account old, Account newest)
	{
		Account a = accountList.get(accountList.indexOf(old));
		a.setBalance(newest.getBalance());
		a.setCode(newest.getCode());
		a.setCreationDate(newest.getCreationDate());
		a.setLibelle(newest.getLibelle());
		a.setUpdateDate(newest.getUpdateDate());
		a.setUser(newest.getUser());
	}

	public ArrayList<Account> getAccountListArray()
	{
		return accountList;
	}
	
	public void deleteAccount(Account account)
	{
		for (Account a: accountList)
		{
			if (a.getNumber() == account.getNumber())
			{
				accountList.remove(a);
				System.out.println("Account : "+a.getLibelle() + " - " + a.getNumber()
				+ " Solde: "+a.getBalance() +" is removed");
			
			}
		}
	}

	public void linkUser(Account account, User user) {
		account.setUser(user);
	}
		
}
