package com.thirdware.volatilekeyword;

public class Counter extends Thread {
	
	private boolean isCounting = true;
	private volatile int count = 1;
	
	public void run() {
		while(isCounting) {
			System.out.println("Count value: "+count+" from thread: "+currentThread().getName());
			count++;
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void stopCounting() {
		isCounting = false;
	}
}
