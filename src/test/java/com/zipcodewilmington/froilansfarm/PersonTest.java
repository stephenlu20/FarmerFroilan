package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Farmer;
import com.zipcodewilmington.froilansfarm.Pilot;
import com.zipcodewilmington.froilansfarm.Horse;
import com.zipcodewilmington.froilansfarm.EarCorn;
import com.zipcodewilmington.froilansfarm.Tomato;
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
        assertEquals("Froilan says 'Yee haw!'", froilan.makeNoise());
    }
    
    @Test
    public void testPilotMakesNoise() {
        Pilot froilanda = new Pilot("Froilanda");
        assertEquals("Froilanda says 'Ready for takeoff!'", froilanda.makeNoise());
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