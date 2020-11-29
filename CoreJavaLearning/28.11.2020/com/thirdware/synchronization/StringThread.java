package com.thirdware.synchronization;

import java.util.List;

public class StringThread extends Thread {

    private List<Character> names;
    private String message;

    public StringThread(List<Character> names, String message) {
        this.names = names;
        this.message = message;
    }

    @Override
    public void run() {
        synchronized (names) {
            System.out.println("'Names' aquired by " + Thread.currentThread().getName());
            for (int i = 0; i < message.length(); i++) {
                try {
                    names.add(message.charAt(i));
                    Thread.sleep(50);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            System.out.println(names);
        }
    }

}

