package com.zipcodewilmington.froilansfarm;
import org.junit.jupiter.api.Test;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import static org.junit.jupiter.api.Assertions.*;

public class EggTest {
    @Test
    public void testEdibleEggCanBeCreated() {
        Egg edibleEgg = new Egg(false);
        assertNotNull(edibleEgg);
    }

    @Test
    public void testFertilizedEggCanBeCreated() {
        Egg fertilizedEgg = new Egg(true);
        assertNotNull(fertilizedEgg);
    }

    @Test
    public void testEggImplementsEdible() {
        Egg egg = new Egg(false);
        assertTrue(egg instanceof Edible);
    }

    @Test
    public void testUnfertilizedEggIsEdible() {
        Egg egg = new Egg(false);
        assertTrue(egg.getIsEdible());
    }

    @Test
    public void testFertilizedEggIsNotEdible() {
        Egg egg = new Egg(true);
        assertFalse(egg.getIsEdible());
    }

    @Test
    public void testEggKnowsIfFertilized() {
        Egg unfertilizedEgg = new Egg(false);
        Egg fertilizedEgg = new Egg(true);
    }
}
