package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StableTest {

    @Test
    public void testConstructor_DefaultName() {
        // Given
        Stable stable = new Stable();

        // When
        String name = stable.getName();

        // Then
        Assertions.assertEquals("Stable", name);
    }

    @Test
    public void testAddHorse() {
        // Given
        Stable stable = new Stable();
        Horse horse = new Horse(null);

        // When
        boolean added = stable.add(horse);

        // Then
        Assertions.assertTrue(added);
        Assertions.assertEquals(1, stable.size());
        Assertions.assertTrue(stable.contains(horse));
    }

    @Test
    public void testRemoveHorse() {
        // Given
        Stable stable = new Stable();
        Horse horse = new Horse(null);
        stable.add(horse);

        // When
        boolean removed = stable.remove(horse);

        // Then
        Assertions.assertTrue(removed);
        Assertions.assertEquals(0, stable.size());
        Assertions.assertFalse(stable.contains(horse));
    }

    @Test
    public void testGetHorseByIndex() {
        // Given
        Stable stable = new Stable();
        Horse horse = new Horse(null);
        stable.add(horse);

        // When
        Horse result = stable.get(0);

        // Then
        Assertions.assertEquals(horse, result);
    }

    @Test
    public void testGetHorseByInvalidIndex() {
        // Given
        Stable stable = new Stable();

        // When
        Horse result = stable.get(5);

        // Then
        Assertions.assertNull(result);
    }

    @Test
    public void testIsEmptyInitially() {
        // Given
        Stable stable = new Stable();

        // Then
        Assertions.assertTrue(stable.isEmpty());
    }

    @Test
    public void testClearStable() {
        // Given
        Stable stable = new Stable();
        stable.add(new Horse(null));
        stable.add(new Horse(null));

        // When
        stable.clear();

        // Then
        Assertions.assertTrue(stable.isEmpty());
        Assertions.assertEquals(0, stable.size());
    }

    @Test
    public void testCapacityLimit() {
        // Given
        Stable stable = new Stable();
        stable.setCapacity(1);

        Horse h1 = new Horse(null);
        Horse h2 = new Horse(null);

        // When
        boolean firstAdded = stable.add(h1);
        boolean secondAdded = stable.add(h2);

        // Then
        Assertions.assertTrue(firstAdded);
        Assertions.assertFalse(secondAdded);
        Assertions.assertEquals(1, stable.size());
        Assertions.assertTrue(stable.isFull());
    }
    
}
