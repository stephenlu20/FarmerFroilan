package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FarmTest {
    
    @Test
    public void testFarmSetup() {
        Farm farm = new Farm();
        
        assertEquals(3, farm.getStables().size());
        assertEquals(4, farm.getChickenCoops().size());
        assertEquals(2, farm.getFarmHouse().size());
    }
    
    @Test
    public void testFarmHas10Horses() {
        Farm farm = new Farm();
        assertEquals(10, farm.getTotalHorses());
    }
    
    @Test
    public void testFarmHas15Chickens() {
        Farm farm = new Farm();
        assertEquals(15, farm.getTotalChickens());
    }
}