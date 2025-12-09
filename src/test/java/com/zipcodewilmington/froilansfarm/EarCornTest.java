package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import static org.junit.jupiter.api.Assertions.*;

public class EarCornTest {
    private EarCorn earCorn;

    @BeforeEach
    public void setUp() {
        earCorn = new EarCorn();
    }

    @Test
    public void testEarCornCanBeCreated() {
        EarCorn corn = new EarCorn();
        assertNotNull(corn);
    }

    @Test
    public void testEarCornImplementsEdible() {
        assertTrue(earCorn instanceof Edible);
    }

    @Test
    public void testEarCornIsEdible() {
        boolean result = earCorn.isEdible();
        assertTrue(result);
    }
}
