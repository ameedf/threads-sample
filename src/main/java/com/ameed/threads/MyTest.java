package com.ameed.threads;

public class MyTest {
	public static void main(String[] args) throws Exception {

		MyThread2 myThread2 = new MyThread2();
		Thread t = new Thread(myThread2);
		t.start();
		t.join();
		System.out.println("in main");
	}
}
