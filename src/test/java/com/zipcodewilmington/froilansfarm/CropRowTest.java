package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.zipcodewilmington.froilansfarm.Interfaces.CropRow;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class CropRowTest {
    
    private CropRow cropRow;

    @BeforeEach
    public void setUp() {
        cropRow = new CropRow();
    }

    @Test
    public void testCropRowCanBeCreated() {
        CropRow testRow = new CropRow();
        assertNotNull(testRow);
    }

    @Test
    public void testAddCropToCropRow() {
        Crop corn = new CornStalk();
        cropRow.add(corn);
        assertTrue(cropRow.getCrops().contains(corn));
    }

    @Test
    public void testAddMultipleCropsToCropRow() {
        Crop corn1 = new CornStalk();
        Crop corn2 = new CornStalk();
        Crop tomato = new TomatoPlant();

        cropRow.add(corn1);
        cropRow.add(corn2);
        cropRow.add(tomato);

        assertEquals(3, cropRow.getCrops().size());
        assertTrue(cropRow.getCrops().contains(corn1));
        assertTrue(cropRow.getCrops().contains(corn2));
        assertTrue(cropRow.getCrops().contains(tomato));
    }

    @Test
    public void testGetCropsReturnsEmptyListWhenEmpty() {
        assertNotNull(cropRow.getCrops());
        assertEquals(0, cropRow.getCrops().size());
    }

    @Test
    public void testGetCropsReturnsAllCrops() {
        Crop corn = new CornStalk();
        Crop tomato = new TomatoPlant();
        cropRow.add(corn);
        cropRow.add(tomato);

        List<Crop> crops = cropRow.getCrops();

        assertEquals(2, crops.size());
        assertTrue(crops.contains(corn));
        assertTrue(crops.contains(tomato));
    }

    @Test
    public void testCropRowCanStoreDifferentCrops() {
        Crop cornStalk = new CornStalk();
        Crop tomatoPlant = new TomatoPlant();

        cropRow.add(cornStalk);
        cropRow.add(tomatoPlant);
        assertEquals(2, cropRow.getCrops().size());
    }
}
