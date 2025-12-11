package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class CarrotPlant extends Crop implements Produce<Carrot>{

    public CarrotPlant() {
        super();
    }

    @Override
    public Carrot yield() {
        if (getHasBeenFertilized() && !getHasBeenHarvested()) {
            return new Carrot();
        }
        return null;
    }
}
