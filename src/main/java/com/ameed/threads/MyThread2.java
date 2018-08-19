package com.ameed.threads;

import java.util.List;

public class MyThread2 implements Runnable {
	private List<Integer> list;

	public MyThread2() {
	}

	public MyThread2(List<Integer> list) {
		this.list = list;
	}

	public void run() {
		// create random number
		int number = (int) (Math.random() * 100);
		// and insert into list
		list.add(number);
	}

}
