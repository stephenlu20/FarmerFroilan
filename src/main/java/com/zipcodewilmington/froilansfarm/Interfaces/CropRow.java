package com.zipcodewilmington.froilansfarm.Interfaces;
import com.zipcodewilmington.froilansfarm.Crop; 

import java.util.ArrayList;
import java.util.List;

public class CropRow {
    private List<Crop> crops;

    public CropRow() {
        this.crops = new ArrayList<>();
    }

    public void add(Crop crop) {
        crops.add(crop);
    }

    public List<Crop> getCrops() {
        return crops;
    }

    public Integer size() {
        return crops.size();
    }
}
