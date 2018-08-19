package com.ameed.threads;

public class MyThread extends Thread {
	private final int number;

	public MyThread(int number) {
		super();
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("My number is:" + number);
	}

}
