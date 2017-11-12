package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Data.AccountData;
import Data.UserData;
import Entity.Account;
import Entity.User;
import Functionalities.AccountOperation;

class AccountOperationTest {
	AccountOperation accountOp = new AccountOperation();

	@Test
	public void withdrawTest()
	{
				
		AccountData accountData = new AccountData();
		Account account = accountData.getAccountListArray().get(2);	
		float money = 250;
		
		assertTrue("the money could not be withdrawn", accountOp.withdraw(account, money,account.getCode()));
	}

	@Test
	public void depositTest()
	{
		AccountData accountData = new AccountData();
		Account account = accountData.getAccountListArray().get(1);
		float money = 300; 
		
		assertTrue("the money could not be deposited", accountOp.deposit(account, money ,account.getCode()));
	}

}
