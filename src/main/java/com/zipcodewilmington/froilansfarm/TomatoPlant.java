package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class TomatoPlant implements Produce {
    private boolean hasBeenFertilized = false;
    private boolean hasBeenHarvested = false;

    public TomatoPlant() {
    }

    @Override
    public Edible yield() {
        return new Tomato();
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
