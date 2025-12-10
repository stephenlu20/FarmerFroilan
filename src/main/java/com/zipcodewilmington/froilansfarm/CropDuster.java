package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.CropRow;

public class CropDuster extends Aircraft implements FarmVehicle {

    @Override
    public String fly() {
        return "We out here cropdustin' bruh";
    }

    @Override
    public void operate(Farm farm) {
        Field field = farm.getField();
        for (CropRow row : field.getRows()) {
            fertilize(row);
        }
    }

    public void fertilize(CropRow cropRow) {
        for (Crop crop : cropRow.getCrops()) {
            crop.setHasBeenFertilized(true);
        }
    }
}