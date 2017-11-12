package test;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

import Data.AccountData;
import Data.UserData;
import Entity.Account;
import Entity.User;
import Functionalities.AccountManagment;

class AccountManagmentTest {
	
	AccountManagment accountManagment = new AccountManagment();
	AccountData data = new AccountData();
	UserData users= new UserData();
	
		
	@Test
	public void addAccountTest()
	{
		Account account = new Account();
		account.setLibelle("Test Account");
		account.setNumber(0123456);
		account.setCreationDate(new Date());
		account.setCode(1212);
		account.setBalance(100);
		User user = users.getUserListArray().get(3);
		account.setUser(user);
		
		assertTrue("account is not added",accountManagment.addAccount(account));
	}
	
	@Test 
	public void deleteAccountTest()
	{
		Account account = new Account();
		account.setNumber(0123457);
		
		assertTrue("account is not deleted",accountManagment.deleteAccount(account));
	}
	
	@Test 
	public void updateAccountTest()
	{
		Account a = new Account();
		a.setBalance(500);
		
		Account a1 = data.getAccountListArray().get(0);
		assertTrue("account is not updated",accountManagment.updateAccount(a1,a));
	}
	
	
	@Test 
	public void finUserAccountsTest()
	{
		User user = users.getUserListArray().get(0);
		assertTrue("user is not found",accountManagment.findUserAccounts(user));
	}
	
	@Test 
	public void  totalUserAcountBalanceTest()
	{
		User user = users.getUserListArray().get(0);
		assertTrue("total account balance error",accountManagment.totalUserAcountBalance(user));
	}

}
