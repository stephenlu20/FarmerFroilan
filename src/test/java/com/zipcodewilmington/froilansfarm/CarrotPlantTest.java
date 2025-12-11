package com.zipcodewilmington.froilansfarm;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class CarrotPlantTest {
    @Test
    public void testYieldReturnsNullWhenNotFertilized() {
        CarrotPlant carrotPlant = new CarrotPlant();
        Carrot result = carrotPlant.yield();
        assertNull(result);
    }
    
    @Test
    public void testYieldReturnsNullWhenAlreadyHarvested() {
        CarrotPlant carrotPlant = new CarrotPlant();
        carrotPlant.setHasBeenFertilized(true);  
        carrotPlant.setHasBeenHarvested(true);   
        Carrot result = carrotPlant.yield();
        assertNull(result);
}

    
    @Test
    public void testYieldReturnsCarrotWhenFertilizedAndNotHarvested() {
        CarrotPlant carrotPlant = new CarrotPlant();
        carrotPlant.setHasBeenFertilized(true);
        Carrot result = carrotPlant.yield();  
        assertNotNull(result);
        assertTrue(result instanceof Carrot);
    }

    
    @Test
    public void testYieldReturnsEdible() {
        CarrotPlant carrotPlant = new CarrotPlant();
        carrotPlant.setHasBeenFertilized(true);  
        Carrot result = carrotPlant.yield();
        assertNotNull(result);
        assertTrue(result.getIsEdible());
    }

    
    @Test
    public void testHasBeenFertilizedInitiallyFalse() {
        CarrotPlant carrotPlant = new CarrotPlant();
        assertFalse(carrotPlant.getHasBeenFertilized());
    }
    
    @Test
    public void testFertilize() {
        CarrotPlant carrotPlant = new CarrotPlant();
        carrotPlant.setHasBeenFertilized(true);  
        assertTrue(carrotPlant.getHasBeenFertilized());
    }
    
    @Test
    public void testHasBeenHarvestedInitiallyFalse() {
        CarrotPlant carrotPlant = new CarrotPlant();
        assertFalse(carrotPlant.getHasBeenHarvested());
    }
    
    @Test
    public void testHarvest() {
        CarrotPlant carrotPlant = new CarrotPlant();
        carrotPlant.setHasBeenHarvested(true);  
        assertTrue(carrotPlant.getHasBeenHarvested());
    }
    
    @Test
    public void testFertilizeAndHarvest() {
        CarrotPlant carrotPlant = new CarrotPlant();
        carrotPlant.setHasBeenFertilized(true);  
        carrotPlant.setHasBeenHarvested(true);  
        assertTrue(carrotPlant.getHasBeenFertilized());
        assertTrue(carrotPlant.getHasBeenHarvested());
    }
    
    @Test
    public void testImplementsProduce() {
        CarrotPlant carrotPlant = new CarrotPlant();
        assertTrue(carrotPlant instanceof Produce);
    }
    
    @Test
    public void testExtendsCrop() {
        CarrotPlant carrotPlant = new CarrotPlant();
        assertTrue(carrotPlant instanceof Crop);
    }
}
