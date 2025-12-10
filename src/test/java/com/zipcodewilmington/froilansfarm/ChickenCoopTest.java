package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChickenCoopTest {
    @Test
    public void testConstructorName() {
        // Given
        ChickenCoop chickenCoop = new ChickenCoop();

        // When
        String name = chickenCoop.getName();

        // Then
        Assertions.assertEquals("Chicken Coop", name);
    }

    @Test
    public void testAddChicken() {
        // Given
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken = new Chicken();

        // When
        boolean added = chickenCoop.add(chicken);

        // Then
        Assertions.assertTrue(added);
        Assertions.assertEquals(1, chickenCoop.size());
        Assertions.assertTrue(chickenCoop.contains(chicken));
    }

    @Test
    public void testRemoveChicken() {
        // Given
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken = new Chicken();
        chickenCoop.add(chicken);

        // When
        boolean removed = chickenCoop.remove(chicken);

        // Then
        Assertions.assertTrue(removed);
        Assertions.assertEquals(0, chickenCoop.size());
        Assertions.assertFalse(chickenCoop.contains(chicken));
    }

    @Test
    public void testGetChickenByIndex() {
        // Given
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken p = new Chicken();
        chickenCoop.add(p);

        // When
        Chicken result = chickenCoop.get(0);

        // Then
        Assertions.assertEquals(p, result);
    }

    @Test
    public void testGetInvalidIndexReturnsNull() {
        // Given
        ChickenCoop chickenCoop = new ChickenCoop();

        // When
        Chicken result = chickenCoop.get(5);

        // Then
        Assertions.assertNull(result);
    }

    @Test
    public void testIsEmptyInitially() {
        // Given
        ChickenCoop chickenCoop = new ChickenCoop();

        // Then
        Assertions.assertTrue(chickenCoop.isEmpty());
    }

    @Test
    public void testClearChickenCoop() {
        // Given
        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.add(new Chicken());
        chickenCoop.add(new Chicken());

        // When
        chickenCoop.clear();

        // Then
        Assertions.assertTrue(chickenCoop.isEmpty());
        Assertions.assertEquals(0, chickenCoop.size());
    }

    @Test
    public void testCapacityLimit() {
        // Given
        ChickenCoop farmhouse = new ChickenCoop();
        farmhouse.setCapacity(1);

        Chicken p1 = new Chicken();
        Chicken p2 = new Chicken();

        // When
        boolean firstAdded = farmhouse.add(p1);
        boolean secondAdded = farmhouse.add(p2);

        // Then
        Assertions.assertTrue(firstAdded);
        Assertions.assertFalse(secondAdded);
        Assertions.assertEquals(1, farmhouse.size());
        Assertions.assertTrue(farmhouse.isFull());
    }
}
