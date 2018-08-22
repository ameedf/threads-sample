package com.ameed.threads.sorter;

public class SortingApplication {

	public static void main(String[] args) {
		
		NumberWrapper wrapper = new NumberWrapper();
		Consumer consumer = new Consumer(wrapper);
		Thread t1 = new Thread(consumer);
		t1.start();
		Producer producer = new Producer(wrapper);
		Thread t2 = new Thread(producer);
		t2.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		wrapper.setNumber(0);
				
	}
}
