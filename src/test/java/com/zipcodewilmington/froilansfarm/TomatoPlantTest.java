package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TomatoPlantTest {
    
    @Test
    public void testYieldReturnsTomato() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        Edible result = tomatoPlant.yield();
        assertTrue(result instanceof Tomato);
    }
    
    @Test
    public void testYieldReturnsEdible() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        Edible result = tomatoPlant.yield();
        assertTrue(result.isEdible());
    }
    
    @Test
    public void testHasBeenFertilizedInitiallyFalse() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        assertFalse(tomatoPlant.hasBeenFertilized());
    }
    
    @Test
    public void testFertilize() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.fertilize();
        assertTrue(tomatoPlant.hasBeenFertilized());
    }
    
    @Test
    public void testHasBeenHarvestedInitiallyFalse() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        assertFalse(tomatoPlant.hasBeenHarvested());
    }
    
    @Test
    public void testHarvest() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.harvest();
        assertTrue(tomatoPlant.hasBeenHarvested());
    }
    
    @Test
    public void testFertilizeAndHarvest() {
        TomatoPlant tomatoPlant = new TomatoPlant();
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