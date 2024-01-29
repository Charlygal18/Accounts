package com.skillabb;

import com.skillabb.model.Account;

public class AccountsMain {

	public static void main(String[] args) {
		Account account = new Account();
		System.out.println("Nombre del cliente: " + account.customerName);
		System.out.println("Número de cuenta: " + account.accountNumber);
		System.out.println("Balance: " + account.balance);
	}

}
