package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Horse extends Animal implements Rideable {
    
    private Rider currentRider;

    public Horse(String name) {
        super(name);
        this.currentRider = null;
    }

    @Override
    public String makeNoise() {
        return "Neigh!";
    }

    @Override
    public boolean mount(Rider rider) {
        if (rider == null || currentRider != null) {
            return false;
        }
        this.currentRider = rider;
        return true;
    }

    @Override
    public boolean dismount(Rider rider) {
        if (currentRider == null || currentRider != rider) {
            return false;
        }
        this.currentRider = null;
        return true;
    }

    @Override
    public boolean isMounted() {
        return currentRider != null;
    }

    @Override
    public Rider getCurrentRider() {
        return currentRider;
    }
}
