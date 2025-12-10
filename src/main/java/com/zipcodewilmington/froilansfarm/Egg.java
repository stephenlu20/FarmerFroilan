package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Egg implements Edible {
    private boolean isFertilized;

    public Egg(boolean isFertilized) {
        this.isFertilized = isFertilized;
    }

    @Override
    public boolean getIsEdible() {
        return !isFertilized;
    }

    public boolean isFertilized() {
        return isFertilized;
    }
}
