package com.zipcodewilmington.froilansfarm;

public abstract class Aircraft extends Vehicle {

    public Aircraft() {
        super();
    }

    public abstract String fly();

    @Override
    public String makeNoise() {
        return "NYOOOOOOOOOOOOOOOOOOOOOOOOMMM";
    }
}