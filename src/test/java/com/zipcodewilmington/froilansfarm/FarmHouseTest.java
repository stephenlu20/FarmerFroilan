package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FarmHouseTest {
    @Test
    public void testConstructorName() {
        // Given
        FarmHouse farmHouse = new FarmHouse();

        // When
        String name = farmHouse.getName();

        // Then
        Assertions.assertEquals("Farm House", name);
    }

    @Test
    public void testAddPerson() {
        // Given
        FarmHouse farmHouse = new FarmHouse();
        Person person = new Farmer(null);

        // When
        boolean added = farmHouse.add(person);

        // Then
        Assertions.assertTrue(added);
        Assertions.assertEquals(1, farmHouse.size());
        Assertions.assertTrue(farmHouse.contains(person));
    }

    @Test
    public void testRemovePerson() {
        // Given
        FarmHouse farmHouse = new FarmHouse();
        Person person = new Farmer(null);
        farmHouse.add(person);

        // When
        boolean removed = farmHouse.remove(person);

        // Then
        Assertions.assertTrue(removed);
        Assertions.assertEquals(0, farmHouse.size());
        Assertions.assertFalse(farmHouse.contains(person));
    }

    @Test
    public void testGetPersonByIndex() {
        // Given
        FarmHouse farmHouse = new FarmHouse();
        Person p = new Farmer(null);
        farmHouse.add(p);

        // When
        Person result = farmHouse.get(0);

        // Then
        Assertions.assertEquals(p, result);
    }

    @Test
    public void testGetInvalidIndexReturnsNull() {
        // Given
        FarmHouse farmHouse = new FarmHouse();

        // When
        Person result = farmHouse.get(5);

        // Then
        Assertions.assertNull(result);
    }

    @Test
    public void testIsEmptyInitially() {
        // Given
        FarmHouse farmHouse = new FarmHouse();

        // Then
        Assertions.assertTrue(farmHouse.isEmpty());
    }

    @Test
    public void testClearFarmHouse() {
        // Given
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.add(new Farmer(null));
        farmHouse.add(new Farmer(null));

        // When
        farmHouse.clear();

        // Then
        Assertions.assertTrue(farmHouse.isEmpty());
        Assertions.assertEquals(0, farmHouse.size());
    }

    @Test
    public void testCapacityLimit() {
        // Given
        FarmHouse farmhouse = new FarmHouse();
        farmhouse.setCapacity(1);

        Person p1 = new Farmer(null);
        Person p2 = new Farmer(null);

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
