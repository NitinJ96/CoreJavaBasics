package com.thirdware.synchronization;

import java.util.ArrayList;
import java.util.List;

public class SynchronizationMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		List<Character> list = new ArrayList<>();

        Thread thread1 = new StringThread(list, "HELLO");
        thread1.start();

        Thread thread2 = new StringThread(list, "WORLD");
        thread2.start();

        thread1.join();
        thread2.join();
	}

}
