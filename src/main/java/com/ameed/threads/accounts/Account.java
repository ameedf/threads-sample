package com.ameed.threads.accounts;

public class Account {
	private long balance;

	public long getBalance() {
		return balance;
	}

	public void withdrow() {
		this.balance--;
	}

	public void deposit() {
		this.balance++;
	}
}
