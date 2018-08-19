package com.ameed.threads.accounts;

public class SavingPerson extends AbstractAccountUser {

	public SavingPerson(Account account) {
		super(account);
	}

	@Override
	public void use() {
		account.deposit();
	}
}
