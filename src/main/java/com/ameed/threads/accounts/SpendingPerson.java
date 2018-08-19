package com.ameed.threads.accounts;

public class SpendingPerson extends AbstractAccountUser {

	public SpendingPerson(Account account) {
		super(account);
	}

	@Override
	public void use() {
		account.withdrow();
	}
}
