package com.skillabb.service.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import com.skillabb.exceptions.GenerateAccountException;
import com.skillabb.exceptions.InvalidAccountException;
import com.skillabb.model.Account;
import com.skillabb.model.Accounts;

public class AccountsImp implements AccountService{
	private static final String NUM_CUENTA_NO_VALIDO = "32145678";
	private Accounts accounts = new Accounts();
	//private Account[] accounts = new Account[3];
	
	@Override
	public void validateAccounts(Account account) {
		if(account.getBalance() > 0.0 && !account.getAccountNumber().equals(NUM_CUENTA_NO_VALIDO)) {
			System.out.println("La cuenta existe");
		}
		else {
			throw new InvalidAccountException();
		}
	}
	
	@Override
	public void generateAccounts(int numAccounts, int numCards) {
		if(numAccounts >= 1) {
		for (int i = 0; i < numAccounts; i++) {
            Account account = new Account(getName(), generateAccountNumber(), generateAmount());
            List<String> cardNumbers = new ArrayList<>();
            for (int j = 0; j < numCards; j++) {
                cardNumbers.add(UUID.randomUUID().toString());
            }
            account.setCardNumber(cardNumbers);
            accounts.getAccountList().add(account);
        }
		}
		else {
			throw new GenerateAccountException();
		}
    }
	
	public boolean validateAccount(Account account) {
		return account.getBalance() > 0.0 && !account.getAccountNumber().equals(NUM_CUENTA_NO_VALIDO);
 	}
	
	private String getName() {
        List<String> names = new ArrayList<>();
        names.add("Daniel");
        names.add("Carlos");
        names.add("Adrian");
        names.add("Ruben");
        names.add("Rocio");
        Random rand = new Random();
        return names.get(rand.nextInt(names.size())) + getLastname();
    }

    private String getLastname() {
        List<String> lastnames = new ArrayList<>();
        lastnames.add(" Lopez");
        lastnames.add(" Santiago");
        lastnames.add(" Martinez");
        lastnames.add(" Perez");
        lastnames.add(" Ortega");
        Random rand = new Random();
        return lastnames.get(rand.nextInt(lastnames.size()));
    }

    private String generateAccountNumber() {
        Random rand = new Random();
        return String.valueOf(100000000 + rand.nextInt(900000000));
    }

    private double generateAmount() {
        return new Random().nextDouble();
    }

    public Accounts getAccounts() {
        return accounts;
    }

	/*
	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	*/
}
