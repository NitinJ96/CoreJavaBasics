package com.thirdware.sleep;

public class CustomThread extends Thread {

    private boolean shouldExit = false;

    public void setShouldExit(boolean shouldExit) {
        this.shouldExit = shouldExit;
    }
    
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if(shouldExit){
                    break;
                }
                System.out.println("Thread is runnning!");
                Thread.sleep(200);
            }
            System.out.println("Thread is completed");
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }

}