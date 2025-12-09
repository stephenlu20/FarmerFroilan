package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class NoiseMakerTest {
    class TestNoiseMaker implements NoiseMaker {
        @Override
        public String makeNoise() {
            return "Test noise";
        }
    }

    @Test
    void makeNoise_shouldReturnExpectedString() {
        NoiseMaker noiseMaker = new TestNoiseMaker();
        String noise = noiseMaker.makeNoise();
        
        assertEquals("Test noise", noise);
    }
}
