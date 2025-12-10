package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Pilot extends Person implements Rider  {
   
    @Override
    public void mount(Rideable rideable) {
        System.out.println("Pilot mounts the rideable.");
    }

    @Override
    public void dismount(Rideable rideable) {
        System.out.println("Pilot dismounts the rideable.");
    }

    public Pilot(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "Takeoff!";
    }
}
