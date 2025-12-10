package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce<Egg> {

    private boolean hasBeenFertilized = false;
    private boolean hasBeenHarvested = false;

    public Chicken() {
        super("Chicken");
    }

    public Chicken(String name) {
        super(name);
    }

    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    @Override
    public void eat (Edible food) {
        if (food instanceof EarCorn){
            System.out.println("Chicken has been fed");
        } else {
            System.out.println("Chickens only eat corn.");
        }
    }

    @Override
    public String makeNoise() {
        return "Cluck cluck!";
    }

    @Override
    public Egg yield() {
        if (!hasBeenFertilized && !hasBeenHarvested) {
            hasBeenHarvested = true;
            return new Egg(hasBeenFertilized);
        } else if (hasBeenFertilized && !hasBeenHarvested) {
            hasBeenHarvested = true;
            return new Egg(hasBeenFertilized);
        } else {
            return null;
        }
    }
}
