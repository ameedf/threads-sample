package com.ameed.threads.accounts;

public class AccountsApplication {
	public static void main(String[] args) throws InterruptedException {
		Account account = new Account();
		
		for (int i = 0; i < 1000; i++) {
			AbstractAccountUser s = new SpendingPerson(account);
			Thread t = new Thread(s);
			t.start();
		}
		for (int i = 0; i < 1000; i++) {
			AbstractAccountUser s = new SavingPerson(account);
			Thread t = new Thread(s);
			t.start();
		}

		Thread.sleep(1000);
		
		System.out.println();
		System.out.println(account.getBalance());
		
		
	}
}
