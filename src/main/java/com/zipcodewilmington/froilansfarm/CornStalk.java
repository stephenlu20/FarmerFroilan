package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class CornStalk extends Crop implements Produce<EarCorn>{

    public CornStalk() {
        super();
    }
    
    @Override
    public EarCorn yield() {
        if (getHasBeenFertilized() && !getHasBeenHarvested()) {
            return new EarCorn();
        }
        return null;
    }
}