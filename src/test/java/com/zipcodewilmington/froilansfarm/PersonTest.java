package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    
    @Test
    public void testFarmerName() {
        Farmer froilan = new Farmer("Froilan");
        assertEquals("Froilan", froilan.getName());
    }
    
    @Test
    public void testFarmerMakesNoise() {
        Farmer froilan = new Farmer("Froilan");
        assertEquals("Froilan says 'YAML!'", froilan.makeNoise());
    }
    
    @Test
    public void testPilotMakesNoise() {
        Pilot froilanda = new Pilot("Froilanda");
        assertEquals("Takeoff!", froilanda.makeNoise());
    }
    
    @Test
    public void testPersonCanEat() {
        Farmer froilan = new Farmer("Froilan");
        froilan.eat(new EarCorn());
        assertTrue(froilan.hasBeenFed());
    }
    
    @Test
    public void testPersonCanRideHorse() {
        Farmer froilan = new Farmer("Froilan");
        Horse horse = new Horse("Spirit");
        
        froilan.mount(horse);
        assertTrue(horse.isMounted());
        
        froilan.dismount(horse);
        assertFalse(horse.isMounted());
    }
    
    @Test
    public void testFroilanRides10Horses() {
        Farmer froilan = new Farmer("Froilan");
        
        for (int i = 0; i < 10; i++) {
            Horse horse = new Horse("Horse" + i);
            froilan.mount(horse);
            assertTrue(horse.isMounted());
            froilan.dismount(horse);
        }
    }
}