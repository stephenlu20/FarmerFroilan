package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;


public abstract class Animal implements NoiseMaker, Eater {

    private String name;
    private boolean hasBeenFed;

    public Animal(String name) {
        this.name = name;
        this.hasBeenFed = false;
    }

    @Override
    public abstract String makeNoise();

    @Override
    public void eat(Edible food) {
        if (food != null) {
            this.hasBeenFed = true;
        }
    }
    
    public boolean hasBeenFed() {
        return hasBeenFed;
    }
    
    public void setHasBeenFed(boolean hasBeenFed) {
        this.hasBeenFed = hasBeenFed;
    }
    public String getName() {
        return name;
    }

    public void setNAme(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + " named " + name;
    }
}
    

