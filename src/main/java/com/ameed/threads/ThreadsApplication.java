package com.ameed.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadsApplication {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		for (int j = 0; j < 10; j++) {
			MyThread2 a = new MyThread2(list);
			Thread t = new Thread(a);
			t.start();
		}
		
		for (Integer number : list) {
			System.out.println(number);
		}

	}

}
