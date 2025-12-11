package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class CarrotTest {
    private Carrot carrot;

    @BeforeEach
    public void setUp() {
        carrot = new Carrot();
    }

    @Test
    public void testCarrotCanBeCreated() {
        Carrot corn = new Carrot();
        assertNotNull(corn);
    }

    @Test
    public void testCarrotImplementsEdible() {
        assertTrue(carrot instanceof Edible);
    }

    @Test
    public void testCarrotIsEdible() {
        boolean result = carrot.getIsEdible();
        assertTrue(result);
    }
}
