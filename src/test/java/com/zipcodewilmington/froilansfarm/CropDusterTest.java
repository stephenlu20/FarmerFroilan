package com.zipcodewilmington.froilansfarm;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.Interfaces.CropRow;
import static org.junit.jupiter.api.Assertions.*;

public class CropDusterTest {

    private CropDuster cropDuster;

    @BeforeEach
    public void setUp() {
        cropDuster = new CropDuster();
    }

    @Test
    public void testCropDusterCanBeCreated() {
        assertNotNull(cropDuster);
    }

    @Test
    public void testCropDusterIsFarmVehicle() {
        assertTrue(cropDuster instanceof FarmVehicle);
    }

    @Test
    public void testCropDusterIsAircraft() {
        assertTrue(cropDuster instanceof Aircraft);
    }

    @Test
    public void testCropDusterCanMakeNoise() {
        String noise = cropDuster.makeNoise();
        assertNotNull(noise);
        assertFalse(noise.isEmpty());
    }

    @Test
    public void testCropDusterCanFly() {
        String flyResult = cropDuster.fly();
        assertNotNull(flyResult);
    }

    @Test
    public void testCropDusterCanFertilizeCropRow() {
        CropRow cropRow = new CropRow();
        CornStalk crop1 = new CornStalk();
        CornStalk crop2 = new CornStalk();
        cropRow.add(crop1);
        cropRow.add(crop2);
        assertFalse(crop1.getHasBeenFertilized());
        assertFalse(crop2.getHasBeenFertilized());
        cropDuster.fertilize(cropRow);
        assertTrue(crop1.getHasBeenFertilized());
        assertTrue(crop2.getHasBeenFertilized());
    }
}