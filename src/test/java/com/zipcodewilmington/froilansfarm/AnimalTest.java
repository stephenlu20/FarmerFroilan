package com.zipcodewilmington.froilansfarm;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
    
    @Test
    public void testHorseName() {
        Horse horse = new Horse("Spirit");
        assertEquals("Spirit", horse.getName());
    }
    
    @Test
    public void testHorseStartsNotFed() {
        Horse horse = new Horse("Spirit");
        assertFalse(horse.hasBeenFed());
    }
    
    @Test
    public void testHorseCanEat() {
        Horse horse = new Horse("Spirit");
        horse.eat(new EarCorn());
        assertTrue(horse.hasBeenFed());
    }
    
    @Test
    public void testHorseMakesNoise() {
        Horse horse = new Horse("Spirit");
        assertEquals("Neigh!", horse.makeNoise());
    }
    
    @Test
    public void testChickenMakesNoise() {
        Chicken chicken = new Chicken("Henrietta");
        assertEquals("Cluck cluck!", chicken.makeNoise());
    }
    
    @Test
    public void testToString() {
        Horse horse = new Horse("Spirit");
        assertEquals("Horse named Spirit", horse.toString());
    }
}