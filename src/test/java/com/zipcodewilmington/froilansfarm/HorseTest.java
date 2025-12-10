package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HorseTest {
    
    @Test
    public void testHorseName() {
        Horse horse = new Horse("Spirit");
        assertEquals("Spirit", horse.getName());
    }
    
    @Test
    public void testHorseMakesNoise() {
        Horse horse = new Horse("Spirit");
        assertEquals("Neigh!", horse.makeNoise());
    }
    
    @Test
    public void testHorseCanEat() {
        Horse horse = new Horse("Spirit");
        horse.eat(new EarCorn());
        
        assertTrue(horse.hasBeenFed());
    }
    
    @Test
    public void testHorseCanBeMounted() {
        Horse horse = new Horse("Spirit");
        Farmer froilan = new Farmer("Froilan");
        
        horse.mount(froilan);
        
        assertTrue(horse.isMounted());
    }
    
    @Test
    public void testHorseCanBeDismounted() {
        Horse horse = new Horse("Spirit");
        Farmer froilan = new Farmer("Froilan");
        
        horse.mount(froilan);
        horse.dismount(froilan);
        
        assertFalse(horse.isMounted());
    }
    
    @Test
    public void testRide10Horses() {
        Farmer froilan = new Farmer("Froilan");
        
        for (int i = 0; i < 10; i++) {
            Horse horse = new Horse("Horse" + i);
            horse.mount(froilan);
            assertTrue(horse.isMounted());
            horse.dismount(froilan);
        }
    }
    
    @Test
    public void testFeed10Horses() {
        for (int i = 0; i < 10; i++) {
            Horse horse = new Horse("Horse" + i);
            horse.eat(new EarCorn());
            horse.eat(new EarCorn());
            horse.eat(new EarCorn());
            assertTrue(horse.hasBeenFed());
        }
    }
}