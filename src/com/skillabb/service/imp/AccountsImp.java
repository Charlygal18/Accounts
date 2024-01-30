package com.skillabb.service.imp;

import com.skillabb.model.Account;

public class AccountsImp {
	private static final String NUM_CUENTA_NO_VALIDO = "32145678";
	private Account[] accounts = new Account[3];
	
	public void validateAccounts(Account account) {
		if(account.getBalance() > 0.0 && !account.getAccountNumber().equals(NUM_CUENTA_NO_VALIDO)) {
			System.out.println("La cuenta existe");
		}
		else {
			System.out.println("La cuenta no existe");
		}
	}
	
	public void generateAccounts() {
		accounts[0] = new Account("Alan Saji", "2", 200.0);
		accounts[1] = new Account("Diana Escorcia", "3", 230.5);
		accounts[2] = new Account("Eloy Gómez", "4", 190.2);
		
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

}
