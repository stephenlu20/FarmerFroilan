package com.zipcodewilmington.froilansfarm;

public class TomatoPlant implements Produce {
    private boolean hasBeenFertilized = false;
    private boolean hasBeenHarvested = false;

    public TomatoPlant() {
    }

    @Override
    public String yield() {
        return "Tomato";
    }

    @Override
    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }

    @Override
    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void fertilize() {
        this.hasBeenFertilized = true;
    }

    public void harvest() {
        this.hasBeenHarvested = true;
    }
}
