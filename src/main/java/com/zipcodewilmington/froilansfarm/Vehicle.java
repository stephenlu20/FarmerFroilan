package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;


public abstract class Vehicle implements Rideable, NoiseMaker {
    private boolean mounted = false;
    private Rider currentRider = null;

    @Override 
    public boolean mount(Rider rider) {
        if (!mounted) {
            this.mounted = true;
            this.currentRider = rider;
            return true;    
        }
        return false;
    }

    @Override 
    public boolean dismount(Rider rider) {
        if (mounted && this.currentRider == rider) {
            this.mounted = false;
            this.currentRider = null;
            return true;
        }
        return false;
    }

    @Override
    public boolean isMounted() {
        return mounted;
    }

    @Override
    public Rider getCurrentRider() {
        return currentRider;
    }

    @Override
    public abstract String makeNoise();
}
