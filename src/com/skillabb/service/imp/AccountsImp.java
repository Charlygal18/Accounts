package com.skillabb.service.imp;

import com.skillabb.model.Account;

public class AccountsImp {
	private static final String NUM_CUENTA_NO_VALIDO = "32145678";
	
	public void validateAccounts(Account account) {
		if(account.balance > 0.0 && !account.accountNumber.equals(NUM_CUENTA_NO_VALIDO)) {
			System.out.println("La cuenta existe");
		}
		else {
			System.out.println("La cuenta no existe");
		}
	}

}
