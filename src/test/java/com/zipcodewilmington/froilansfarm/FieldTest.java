package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FieldTest {
    Field field;
    CropRow cropRow;

    @BeforeEach
    public void setUp() {
        field = new Field();
        cropRow = new CropRow();
    }

    @Test
    public void testFieldConstructor() {
        Field testField = new Field();
        assertNotNull(testField);
    }

    @Test
    public void testAddCropRowToField() {
        Crop corn = new CornStalk();
        cropRow.add(corn);
        field.addRow(cropRow);
        assertTrue(field.getRows().get(1).getCrops().contains(corn));
    }

    @Test
    public void testAddMultipleCropRowsToField() {
        Crop corn1 = new CornStalk();
        Crop corn2 = new CornStalk();
        Crop tomato = new TomatoPlant();

        cropRow.add(corn1);
        cropRow.add(corn2);
        cropRow.add(tomato);

        CropRow row2 = new CropRow();
        row2.add(corn1);
        row2.add(corn2);
        row2.add(tomato);

        field.addRow(cropRow);
        field.addRow(row2);

        assertEquals(2, field.getRows().size());
    }

    @Test
    public void testGetCropRowsReturnsEmptyListWhenEmpty() {
        assertNotNull(field.getRows());
        assertEquals(0, field.getRows().size());
    }

    @Test
    public void testGetCropRowsReturnsAllCropRows() {
        Crop corn1 = new CornStalk();
        Crop corn2 = new CornStalk();
        Crop tomato = new TomatoPlant();

        cropRow.add(corn1);
        cropRow.add(corn2);
        cropRow.add(tomato);

        CropRow row2 = new CropRow();
        row2.add(corn1);
        row2.add(corn2);
        row2.add(tomato);

        field.addRow(cropRow);
        field.addRow(row2);

        assertEquals(2, field.getRows().size());
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
