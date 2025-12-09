package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GenericProduceTest {

    @Test
    public void testYieldWithString() {
        GenericProduce<String> corn = new GenericProduce<String>("Corn ears");
        String result = corn.yield();
        assertEquals("Corn ears", result);
    }

    @Test
    public void testYieldWithInteger() {
        GenericProduce<Integer> tomatoes = new GenericProduce<>(25);
        Integer result = tomatoes.yield();
        assertEquals(25, result);
    }

    @Test
    public void testHasBeenFertilizedInitiallyFalse() {
        GenericProduce<String> crop = new GenericProduce<>("Corn");
        assertFalse(crop.hasBeenFertilized());
    }

    @Test
    public void testFertilize() {
        GenericProduce<String> crop = new GenericProduce<>("Corn");
        crop.fertilize();
        assertTrue(crop.hasBeenFertilized());
    }

    @Test
    public void testHasBeenHarvestedInitiallyFalse() {
        GenericProduce<String> tomato = new GenericProduce<>("Tomato");
        assertFalse(tomato.hasBeenHarvested());
    }

    @Test
    public void testHarvest() {
        GenericProduce<String> tomato = new GenericProduce<>("Tomato");
        tomato.harvest();
        assertTrue(tomato.hasBeenHarvested());
    }

    @Test
    public void testFertilizeAndHarvest() {
        GenericProduce<String> corn = new GenericProduce<>("Corn");
        corn.fertilize();
        corn.harvest();
        assertTrue(corn.hasBeenFertilized());
        assertTrue(corn.hasBeenHarvested());
    }



    
}
