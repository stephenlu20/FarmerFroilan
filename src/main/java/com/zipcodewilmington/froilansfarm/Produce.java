package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public interface Produce {
    Edible yield();
    boolean hasBeenFertilized();
    boolean hasBeenHarvested();
}
