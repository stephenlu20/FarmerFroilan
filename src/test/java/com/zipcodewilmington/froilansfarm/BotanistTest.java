package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import com.zipcodewilmington.froilansfarm.Interfaces.CropRow;

import static org.junit.jupiter.api.Assertions.*;

public class BotanistTest {
    
    @Test
    public void testBotanistInterfaceExists() {
        Class<?> botanistInterface = Botanist.class;
        assertTrue(botanistInterface.isInterface());
    }

    @Test
    public void testBotanistHasPlantMethod() throws NoSuchMethodException {
        Class<?> botanistInterface = Botanist.class;
        botanistInterface.getMethod("plant", Crop.class, CropRow.class);
        assertTrue(true);
    }

    @Test
    public void testBotanistCanBeImplemented() {
        Botanist testBotanist = new Botanist() {
            @Override
            public void plant(Crop crop, CropRow cropRow) {
                assertNotNull(crop);
                assertNotNull(cropRow);
            }
        };
        assertNotNull(testBotanist);
    }
}
