package com.thirdware.multilevelinheritanceandsuper;

public class Jaguar extends Car {

    public Jaguar() {
        super("Jaguar", "4WD", 5, 5, 6, false);
    }

    public void accelerate(int rate) {

        int speed = getCurrentSpeed() + rate;
        if(speed <= 0) {
            stop();
            changeGear(1);
        } else if(speed >0 && speed <=10) {
            changeGear(1);
        } else if(speed >10 && speed <=20) {
            changeGear(2);
        } else if(speed >20 && speed <=30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if(speed > 0) {
            changeSpeed(speed);
        }


    }

}
