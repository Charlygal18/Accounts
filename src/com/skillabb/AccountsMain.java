package com.skillabb;

import com.skillabb.model.Account;
import com.skillabb.service.imp.AccountsImp;

public class AccountsMain {

	public static void main(String[] args) {
		//Primer requerimiento
		Account account = new Account("Carlos Galván", "1", 1.0);
		
		System.out.println("Nombre del cliente: " + account.customerName);
		System.out.println("Número de cuenta: " + account.accountNumber);
		System.out.println("Balance: " + account.balance);
		
		//Segundo requerimiento
		AccountsImp accountsImp = new AccountsImp();
		accountsImp.validateAccounts(account);
		
		//Terceer requerimiento
		System.out.println("--------------------------------");
		accountsImp.generateAccounts();
		
		for(Account accounts:accountsImp.getAccounts()) {
			System.out.println("Nombre del cliente: " + accounts.customerName);
			System.out.println("Número de cuenta: " + accounts.accountNumber);
			System.out.println("Balance: " + accounts.balance);
			System.out.println("--------------------------------");
		}
		
	}

}
