package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShelterTest {
    
    @Test
    public void testAddHorse() {
        Stable stable = new Stable("Stable");
        stable.add(new Horse("Spirit"));
        
        assertEquals(1, stable.size());
    }
    
    @Test
    public void testAddChicken() {
        ChickenCoop coop = new ChickenCoop("Coop");
        coop.add(new Chicken());
        
        assertEquals(1, coop.size());
    }
    
    @Test
    public void test10Horses() {
        Stable s1 = new Stable("S1");
        Stable s2 = new Stable("S2");
        Stable s3 = new Stable("S3");
        
        for (int i = 0; i < 4; i++) s1.add(new Horse("H" + i));
        for (int i = 4; i < 7; i++) s2.add(new Horse("H" + i));
        for (int i = 7; i < 10; i++) s3.add(new Horse("H" + i));
        
        assertEquals(10, s1.size() + s2.size() + s3.size());
    }
    
    @Test
    public void test15Chickens() {
        ChickenCoop c1 = new ChickenCoop("C1");
        ChickenCoop c2 = new ChickenCoop("C2");
        ChickenCoop c3 = new ChickenCoop("C3");
        ChickenCoop c4 = new ChickenCoop("C4");
        
        for (int i = 0; i < 4; i++) c1.add(new Chicken());
        for (int i = 4; i < 8; i++) c2.add(new Chicken());
        for (int i = 8; i < 12; i++) c3.add(new Chicken());
        for (int i = 12; i < 15; i++) c4.add(new Chicken());
        
        assertEquals(15, c1.size() + c2.size() + c3.size() + c4.size());
    }
    
}