package com.ameed.threads.accounts;

abstract public class AbstractAccountUser implements Runnable {
	protected Account account;

	public AbstractAccountUser(Account account) {
		super();
		this.account = account;
	}

	public void run() {
		System.out.print("*");
		use();
	}

	public abstract void use();

}
