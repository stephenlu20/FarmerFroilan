package com.zipcodewilmington.froilansfarm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import static org.junit.jupiter.api.Assertions.*;

public class TractorTest {
    
    private Tractor tractor;

    @BeforeEach
    public void setup() {
        tractor = new Tractor();
    }

    @Test
    public void testTractorCanBeCreated() {
        assertNotNull(tractor);
    }

    @Test public void testTractorIsFarmVehicle() {
        assertTrue(tractor instanceof FarmVehicle);
    }

    @Test void testTractorIsNoiseMaker() {
        assertTrue(tractor instanceof NoiseMaker);
    }

    @Test
    public void testTractorIsRidable() {
        assertTrue(tractor instanceof Rideable);
    }

    @Test
    public void testTractorCanMakeNoise() {
        String noise = tractor.makeNoise();
        assertNotNull(noise);
        assertFalse(noise.isEmpty());
    }

    @Test
    public void testTractorCanHarvestCrop() {
        CornStalk crop = new CornStalk();
        crop.setHasBeenFertilized(true);
        assertFalse(crop.getHasBeenHarvested());
        tractor.harvest(crop);
        assertTrue(crop.getHasBeenHarvested());
    }

    @Test
    public void testTractorCanHarvestCropRow() {
        CropRow cropRow = new CropRow();
        CornStalk crop1 = new CornStalk();
        CornStalk crop2 = new CornStalk();
        crop1.setHasBeenFertilized(true);
        crop2.setHasBeenFertilized(true);
        cropRow.add(crop1);
        cropRow.add(crop2);
        tractor.harvestCropRow(cropRow);
        assertTrue(crop1.getHasBeenHarvested());
        assertTrue(crop2.getHasBeenHarvested());
    }
}
