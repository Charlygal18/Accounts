package com.skillabb;

import com.skillabb.exceptions.GenerateAccountException;
import com.skillabb.exceptions.InvalidAccountException;
import com.skillabb.model.Account;
import com.skillabb.service.imp.AccountsImp;

public class AccountsMain {

	public static void main(String[] args) {
		// Primer requerimiento
        Account account = new Account("Carlos Galván", "1", 1.0);

        printAccountDetails(account);

        // Segundo requerimiento
        AccountsImp accountsImp = new AccountsImp();
        try {
            accountsImp.validateAccounts(account);
            System.out.println("Validación exitosa: La cuenta existe");
        } catch (InvalidAccountException e) {
            e.printErrorMessage();
        }

        // Tercer requerimiento
        System.out.println("--------------------------------");

        try {
            accountsImp.generateAccounts(3, 2);
            accountsImp.getAccounts().getAccountList().forEach(AccountsMain::printAccountDetails);
        } catch (GenerateAccountException e) {
            e.printErrorMessage();
        }
    }

    private static void printAccountDetails(Account account) {
        System.out.println("Nombre del cliente: " + account.getCustomerName());
        System.out.println("Número de cuenta: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("--------------------------------");
    }
}