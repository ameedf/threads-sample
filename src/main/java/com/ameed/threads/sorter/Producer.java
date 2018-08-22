package com.ameed.threads.sorter;

public class Producer implements Runnable {
	private boolean finished;
	private final NumberWrapper wrapper;

	public Producer(NumberWrapper wrapper) {
		this.wrapper = wrapper;
	}

	public void run() {
		while(!finished) {
			wrapper.setNumber((int) (Math.random() * 1000000));
		}
		wrapper.setNumber(0);
	}

}
