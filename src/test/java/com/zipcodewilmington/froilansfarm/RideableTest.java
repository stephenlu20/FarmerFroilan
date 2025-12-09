package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RideableTest {
    
    private Farmer froilan;
    private Horse horse;
    
    @BeforeEach
    public void setUp() {
        froilan = new Farmer("Froilan");
        horse = new Horse("Spirit");
    }
    
    @Test
    public void testMount() {
        assertTrue(horse.mount(froilan));
        assertTrue(horse.isMounted());
    }
    
    @Test
    public void testDismount() {
        horse.mount(froilan);
        assertTrue(horse.dismount(froilan));
        assertFalse(horse.isMounted());
    }
    
    @Test
    public void testGetCurrentRider() {
        horse.mount(froilan);
        assertEquals(froilan, horse.getCurrentRider());
    }
    
    @Test
    public void testCannotMountTwice() {
        horse.mount(froilan);
        Farmer other = new Farmer("Other");
        assertFalse(horse.mount(other));
    }
}