package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Carrot implements Edible {

    boolean isEdible;

    public Carrot() {
        this.isEdible = true;
    }

    @Override
    public boolean getIsEdible() {
        return isEdible;
    }
}
