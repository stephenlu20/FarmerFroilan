package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Interfaces.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle; 

public class Tractor extends Vehicle implements FarmVehicle {

    @Override
    public String makeNoise() {
        return "Vroom vroom!";
    }

    @Override
    public void operate(Farm farm) {
        Field field = farm.getField();
        for (CropRow row : field.getRows()) {
            harvestCropRow(row);
        }
    }

    public void harvest(Crop crop) {
        crop.setHasBeenHarvested(true);
    }

    public void harvestCropRow(CropRow cropRow) {
        for (Crop crop : cropRow.getCrops()) {
            harvest(crop);
        }
    }
}
