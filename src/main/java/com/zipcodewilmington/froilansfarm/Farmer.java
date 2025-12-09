package com.zipcodewilmington.froilansfarm;

public class Farmer implements Rider {
    private Rideable currentlyRiding;

    @Override
    public void mount(Rideable rideable) {
        currentlyRiding = rideable;
        System.out.println("Farmer mounted " + rideable);
    }

    @Override
    public void dismount(Rideable rideable) {
        if (currentlyRiding == rideable) {
            currentlyRiding = null;
            System.out.println("Farmer dismounted " + rideable);
        } else {
            System.out.println("Farmer is not riding that!");
        }
    }
}
