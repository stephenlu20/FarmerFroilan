package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public abstract class Aircraft extends Vehicle {

    public Aircraft() {
        super();
    }

    public abstract void fly();

    @Override
    public String makeNoise() {
        return "Vrooooom (aircraft engine noise)";
    }
}