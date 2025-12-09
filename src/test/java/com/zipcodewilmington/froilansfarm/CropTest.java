package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce; 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import static org.junit.jupiter.api.Assertions.*;

public class CropTest {
    private static class TestCrop extends Crop {
        private Edible testEdible;

        public TestCrop(Edible edibleToYield) {
            this.testEdible = edibleToYield;
        }

        @Override
        public Edible yield() {
            if (hasBeenFertilized() && hasBeenHarvested()) {
                return testEdible;
            }
            return null;
        }
    }

    private static class TestEdible implements Edible {
        @Override
        public boolean isEdible() {
            return true;
    }
    }

    private Crop crop;
    private Edible testEdible;

    @BeforeEach
    public void setUp() {
        testEdible = new TestEdible();
        crop = new TestCrop(testEdible);
    }

    @Test
    public void testCropStartsUnfertilized() {
        assertFalse(crop.hasBeenFertilized());
    }

    @Test
    public void testCropStartsUnharvested() {
        assertFalse(crop.hasBeenHarvested());
    }

    @Test
    public void testSetHasBeenFertilized() {
        assertFalse(crop.hasBeenFertilized());
        crop.setHasBeenFertilized(true);
        assertTrue(crop.hasBeenFertilized());
    }

    @Test
    public void testSetHasBeenHarvested() {
        assertFalse(crop.hasBeenHarvested());
        crop.setHasBeenHarvested(true);
        assertTrue(crop.hasBeenHarvested());
    }

    @Test
    public void testCropCantYieldWhenNotFertilized() {
        crop.setHasBeenHarvested(true);
        crop.setHasBeenFertilized(false);
        Edible result = crop.yield();
        assertNull(result);
    }

    @Test
    public void testCropCantYieldWhenNotHarvested() {
        crop.setHasBeenFertilized(true);
        crop.setHasBeenHarvested(false);
        Edible result = crop.yield();
        assertNull(result);
    }

    @Test
    public void testCropYieldsWhenFertilizedAndHarvested() {
        crop.setHasBeenFertilized(true);
        crop.setHasBeenHarvested(true);
        Edible result = crop.yield();
        assertNotNull(result);
        assertEquals(testEdible, result);
    }

    @Test
    public void testCropImplementsProduce() {
        assertTrue(crop instanceof Produce);
    }
}
