package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import static org.junit.jupiter.api.Assertions.*;

public class CornStalkTest {
    
    @Test
    public void testYieldReturnsEarCorn() {
        CornStalk CornStalk = new CornStalk();
        Edible result = CornStalk.yield();
        assertTrue(result instanceof EarCorn);
    }
    
    @Test
    public void testYieldReturnsEdible() {
        CornStalk CornStalk = new CornStalk();
        Edible result = CornStalk.yield();
        assertTrue(result.isEdible());
    }
    
    @Test
    public void testHasBeenFertilizedInitiallyFalse() {
        CornStalk CornStalk = new CornStalk();
        assertFalse(CornStalk.hasBeenFertilized());
    }
    
    @Test
    public void testFertilize() {
        CornStalk CornStalk = new CornStalk();
        CornStalk.fertilize();
        assertTrue(CornStalk.hasBeenFertilized());
    }
    
    @Test
    public void testHasBeenHarvestedInitiallyFalse() {
        CornStalk CornStalk = new CornStalk();
        assertFalse(CornStalk.hasBeenHarvested());
    }
    
    @Test
    public void testHarvest() {
        CornStalk CornStalk = new CornStalk();
        CornStalk.harvest();
        assertTrue(CornStalk.hasBeenHarvested());
    }
    
    @Test
    public void testFertilizeAndHarvest() {
        CornStalk CornStalk = new CornStalk();
        CornStalk.fertilize();
        CornStalk.harvest();
        assertTrue(CornStalk.hasBeenFertilized());
        assertTrue(CornStalk.hasBeenHarvested());
    }
    
    @Test
    public void testImplementsProduce() {
        CornStalk cornStalk = new CornStalk();
        assertTrue(cornStalk instanceof Produce);
    }
}