package com.ameed.threads.sorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Consumer implements Runnable {
	private final NumberWrapper wrapper;

	public Consumer(NumberWrapper wrapper) {
		super();
		this.wrapper = wrapper;
	}

	public void run() {
		int number = wrapper.getNumber();
		while (number != 0) {
			printSorted(number);
			number = wrapper.getNumber();
		}
	}

	private void printSorted(int number) {
		List<Integer> digits = new ArrayList<Integer>();
		String output = number + " --> [";
		if (number == 0) {
			digits.add(0);
		} else {
			while (number > 0) {
				digits.add(number % 10);
				number /= 10;
			}
		}
		Collections.sort(digits);
		for (Integer d : digits) {
			output += d + ",";
		}
		output += "]";
		System.out.println(output);
	}

}
