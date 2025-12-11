package com.zipcodewilmington.froilansfarm;
import org.junit.jupiter.api.Test;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import static org.junit.jupiter.api.Assertions.*;

public class TomatoPlantTest {
    
    @Test
    public void testYieldReturnsNullWhenNotFertilized() {
        TomatoPlant TomatoPlant = new TomatoPlant();
        Tomato result = TomatoPlant.yield();
        assertNull(result);
    }
    
    @Test
    public void testYieldReturnsNullWhenAlreadyHarvested() {
        TomatoPlant TomatoPlant = new TomatoPlant();
        TomatoPlant.setHasBeenFertilized(true);  
        TomatoPlant.setHasBeenHarvested(true);   
        Tomato result = TomatoPlant.yield();
        assertNull(result);
}

    
    @Test
    public void testYieldReturnsEarCornWhenFertilizedAndNotHarvested() {
        TomatoPlant TomatoPlant = new TomatoPlant();
        TomatoPlant.setHasBeenFertilized(true);
        Tomato result = TomatoPlant.yield();  
        assertNotNull(result);
        assertTrue(result instanceof Tomato);
    }

    
    @Test
    public void testYieldReturnsEdible() {
        TomatoPlant TomatoPlant = new TomatoPlant();
        TomatoPlant.setHasBeenFertilized(true);  
        Tomato result = TomatoPlant.yield();
        assertNotNull(result);
        assertTrue(result.getIsEdible());
    }

    
    @Test
    public void testHasBeenFertilizedInitiallyFalse() {
        TomatoPlant TomatoPlant = new TomatoPlant();
        assertFalse(TomatoPlant.getHasBeenFertilized());
    }
    
    @Test
    public void testFertilize() {
        TomatoPlant TomatoPlant = new TomatoPlant();
        TomatoPlant.setHasBeenFertilized(true);  
        assertTrue(TomatoPlant.getHasBeenFertilized());
    }
    
    @Test
    public void testHasBeenHarvestedInitiallyFalse() {
        TomatoPlant TomatoPlant = new TomatoPlant();
        assertFalse(TomatoPlant.getHasBeenHarvested());
    }
    
    @Test
    public void testHarvest() {
        TomatoPlant TomatoPlant = new TomatoPlant();
        TomatoPlant.setHasBeenHarvested(true);  
        assertTrue(TomatoPlant.getHasBeenHarvested());
    }
    
    @Test
    public void testFertilizeAndHarvest() {
        TomatoPlant TomatoPlant = new TomatoPlant();
        TomatoPlant.setHasBeenFertilized(true);  
        TomatoPlant.setHasBeenHarvested(true);  
        assertTrue(TomatoPlant.getHasBeenFertilized());
        assertTrue(TomatoPlant.getHasBeenHarvested());
    }
    
    @Test
    public void testImplementsProduce() {
        TomatoPlant TomatoPlant = new TomatoPlant();
        assertTrue(TomatoPlant instanceof Produce);
    }
    
    @Test
    public void testExtendsCrop() {
        TomatoPlant TomatoPlant = new TomatoPlant();
        assertTrue(TomatoPlant instanceof Crop);
    }
}