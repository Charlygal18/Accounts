package com.skillabb.model;

import java.util.ArrayList;
import java.util.List;

public class Accounts {
	private List<Account> accountList = new ArrayList<>();

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}

	@Override
	public String toString() {
		return "Accounts [accountList=" + accountList + "]";
	}
	
	
}
