package com.zipcodewilmington.froilansfarm.Interfaces;

import java.util.ArrayList;
import java.util.List;

import com.zipcodewilmington.froilansfarm.Crop;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }
}
