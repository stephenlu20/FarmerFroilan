package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class TomatoPlant extends Crop implements Produce<Tomato>{
    
    public TomatoPlant() {
        super();
    }
    
    @Override
    public Tomato yield() {
        if (getHasBeenFertilized() && !getHasBeenHarvested()) {
            return new Tomato();
        }
        return null;
    }
}