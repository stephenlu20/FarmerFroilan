package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Vehicle;

public interface FarmVehicle extends Vehicle {
    void operate(Farm farm);
} 
