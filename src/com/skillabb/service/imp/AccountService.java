package com.skillabb.service.imp;

import com.skillabb.model.Account;

public interface AccountService {
	void validateAccounts(Account account);
    void generateAccounts(int sizeAccounts, int sizeCards);
}
