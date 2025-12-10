package com.zipcodewilmington.froilansfarm;
import org.junit.jupiter.api.Test;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import static org.junit.jupiter.api.Assertions.*;

public class CornStalkTest {
    
    @Test
    public void testYieldReturnsNullWhenNotFertilized() {
        CornStalk cornStalk = new CornStalk();
        EarCorn result = cornStalk.yield();
        assertNull(result);
    }
    
    @Test
    public void testYieldReturnsNullWhenAlreadyHarvested() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);  
        cornStalk.setHasBeenHarvested(true);   
        EarCorn result = cornStalk.yield();
        assertNull(result);
}

    
    @Test
    public void testYieldReturnsEarCornWhenFertilizedAndNotHarvested() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);
        EarCorn result = cornStalk.yield();  
        assertNotNull(result);
        assertTrue(result instanceof EarCorn);
    }

    
    @Test
    public void testYieldReturnsEdible() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);  
        EarCorn result = cornStalk.yield();
        assertNotNull(result);
        assertTrue(result.getIsEdible());
    }

    
    @Test
    public void testHasBeenFertilizedInitiallyFalse() {
        CornStalk cornStalk = new CornStalk();
        assertFalse(cornStalk.getHasBeenFertilized());
    }
    
    @Test
    public void testFertilize() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);  
        assertTrue(cornStalk.getHasBeenFertilized());
    }
    
    @Test
    public void testHasBeenHarvestedInitiallyFalse() {
        CornStalk cornStalk = new CornStalk();
        assertFalse(cornStalk.getHasBeenHarvested());
    }
    
    @Test
    public void testHarvest() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.setHasBeenHarvested(true);  
        assertTrue(cornStalk.getHasBeenHarvested());
    }
    
    @Test
    public void testFertilizeAndHarvest() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);  
        cornStalk.setHasBeenHarvested(true);  
        assertTrue(cornStalk.getHasBeenFertilized());
        assertTrue(cornStalk.getHasBeenHarvested());
    }
    
    @Test
    public void testImplementsProduce() {
        CornStalk cornStalk = new CornStalk();
        assertTrue(cornStalk instanceof Produce);
    }
    
    @Test
    public void testExtendsCrop() {
        CornStalk cornStalk = new CornStalk();
        assertTrue(cornStalk instanceof Crop);
    }
}