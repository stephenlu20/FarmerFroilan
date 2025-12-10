package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.CropRow;

public class CropDuster implements FarmVehicle, Aircraft {
    
    public CropDuster() {

    }

    @Override
    public String makeNoise() {
        return "nyooom!";
    }

    @Override
    public String fly() {
        return "We out here cropdustin' bruh";
    }

    @Override
    public void operate(Farm farm) {

    }

    public void fertilize(CropRow cropRow) {
        for (Crop crop : cropRow.getCrops()) {
            crop.setHasBeenFertilized(true);
        }
    }
}