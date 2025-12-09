package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TomatoPlant {

    @Test 
    public void testYield() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        String result = tomatoPlant.yield();
        assertEquals("Tomato", result);
    }

    @Test
    public void testHasBeenFertilizedInitiallyFalse() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        assertFalse(tomatoPlant.testHasBeenFertilized())
    }

    @Test
    public void testFertilize() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.fertilize();
        assertTrue(tomatoPlant.hasBeenFertilized());
    }

    @Test
    public void testFertilizeAndHarvest() {
        TomatoPlant tomatoPlant. new TomatoPlant();
        tomatoPlant.fertilize();
        tomatoPlant.harvest();
        assertTrue(tomatoPlant.hasBeenFertilized());
        assertTrue(tomatoPlant.hasBeenHarvested());
    }

    @Test
    public void testImplementsProduce() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        assertTrue(tomatoPlant instanceof Produce);
    }
    
}
