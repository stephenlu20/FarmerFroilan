package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import static org.junit.jupiter.api.Assertions.*;

public class ProduceTest {

    @Test 
    public void testYield() {
        Corn corn = new Corn();
        assertEquals("Corn ears", corn.yield());
    }

    @Test
    public void testHasBeenFertilized() {
        Corn corn = new Corn();
        assertFalse(corn.hasBeenFertilized());

        corn.fertilize();
        assertTrue(corn.hasBeenFertilized());
    }

    @Test
    public void testHasBeenHarvested() {
        Corn corn = new Corn();
        assertFalse(corn.hasBeenHarvested());

        corn.fertilize();
        assertTrue(corn.hasBeenHarvested());
    }
}
