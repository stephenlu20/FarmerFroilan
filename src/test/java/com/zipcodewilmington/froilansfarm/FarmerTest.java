package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.CropRow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FarmerTest {
    
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
    public void testFarmerCanEat() {
        Farmer froilan = new Farmer("Froilan");
        froilan.eat(new EarCorn());
        
        assertTrue(froilan.hasBeenFed());
    }
    
    @Test
    public void testFarmerCanRideHorse() {
        Farmer froilan = new Farmer("Froilan");
        Horse horse = new Horse("Spirit");
        
        froilan.mount(horse);
        
        assertTrue(horse.isMounted());
        assertTrue(froilan.isRiding());
    }
    
    @Test
    public void testFarmerCanDismount() {
        Farmer froilan = new Farmer("Froilan");
        Horse horse = new Horse("Spirit");
        
        froilan.mount(horse);
        froilan.dismount(horse);
        
        assertFalse(horse.isMounted());
        assertFalse(froilan.isRiding());
    }
    
    @Test
    public void testFarmerRides10Horses() {
        Farmer froilan = new Farmer("Froilan");
        
        for (int i = 0; i < 10; i++) {
            Horse horse = new Horse("Horse" + i);
            froilan.mount(horse);
            assertTrue(horse.isMounted());
            froilan.dismount(horse);
        }
    }
    
    @Test
    public void testFarmerEatsBreakfast() {
        Farmer froilan = new Farmer("Froilan");
        
        // 1 corn, 2 tomato, 5 eggs
        froilan.eat(new EarCorn());
        froilan.eat(new Tomato());
        froilan.eat(new Tomato());
        froilan.eat(new Egg(false));
        froilan.eat(new Egg(false));
        froilan.eat(new Egg(false));
        froilan.eat(new Egg(false));
        froilan.eat(new Egg(false));
        
        assertTrue(froilan.hasBeenFed());
    }
    
    @Test
    public void testFarmerCanPlant() {
        Farmer froilan = new Farmer("Froilan");
        CropRow cropRow = new CropRow();
        
        froilan.plant(new CornStalk(), cropRow);
        froilan.plant(new CornStalk(), cropRow);
        
        assertEquals(2, cropRow.size());
    }
}
