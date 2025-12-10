package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProduceTest {
    
    @Test 
    public void testYield() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);
        cornStalk.setHasBeenHarvested(false);  
        Edible result = cornStalk.yield();
        assertNotNull(result);
        assertTrue(result instanceof EarCorn);
    }
    
    @Test
    public void testHasBeenFertilized() {
        CornStalk cornStalk = new CornStalk();
        assertFalse(cornStalk.getHasBeenFertilized());
        cornStalk.setHasBeenFertilized(true);
        assertTrue(cornStalk.getHasBeenFertilized());
    }
    
    @Test
    public void testHasBeenHarvested() {
        CornStalk cornStalk = new CornStalk();
        assertFalse(cornStalk.getHasBeenHarvested());
        cornStalk.setHasBeenHarvested(true);
        assertTrue(cornStalk.getHasBeenHarvested());
    }
    
    @Test
    public void testYieldWithTomatoPlant() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenFertilized(true);
        tomatoPlant.setHasBeenHarvested(false);
        Edible result = tomatoPlant.yield();
        assertNotNull(result);
        assertTrue(result instanceof Tomato);
    }
    
    @Test
    public void testYieldReturnsNullWhenNotFertilized() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(false);
        Edible result = cornStalk.yield();
        assertNull(result);
    }
    
    @Test
    public void testYieldReturnsNullWhenAlreadyHarvested() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);
        cornStalk.setHasBeenHarvested(true);
        Edible result = cornStalk.yield();
        assertNull(result);
    }
    
    @Test
    public void testProduceInterfaceWithMultipleCrops() {
        Produce<EarCorn> cornStalk = new CornStalk();
        Produce<Tomato> tomatoPlant = new TomatoPlant();
        
        assertTrue(cornStalk instanceof Produce);
        assertTrue(tomatoPlant instanceof Produce);
    }
    
    @Test
    public void testYieldReturnsEdibleType() {
        CornStalk cornStalk = new CornStalk();
        cornStalk.setHasBeenFertilized(true);
        cornStalk.setHasBeenHarvested(false);
        
        Edible result = cornStalk.yield();
        assertNotNull(result);
        assertTrue(result.getIsEdible());
    }
    
    @Test
    public void testBothCropsFollowProduceContract() {
        
        Produce<EarCorn> corn = new CornStalk();
        assertFalse(corn.getHasBeenFertilized());
        assertFalse(corn.getHasBeenHarvested());
        
       
        Produce<Tomato> tomato = new TomatoPlant();
        assertFalse(tomato.getHasBeenFertilized());
        assertFalse(tomato.getHasBeenHarvested());
    }
}