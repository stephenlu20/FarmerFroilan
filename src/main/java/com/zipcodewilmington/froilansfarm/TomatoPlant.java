package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;


public class TomatoPlant extends Crop {
    
    public TomatoPlant() {
        super();
    }
    
    @Override
    public Edible yield() {
        if (hasBeenFertilized() && hasBeenHarvested()) {
            return new Tomato();
        }
        return null;
    }
}