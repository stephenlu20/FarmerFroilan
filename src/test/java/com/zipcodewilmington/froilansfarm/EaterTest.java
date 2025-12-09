package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;

public class EaterTest {
    static class TestFood implements Edible { }

    static class TestEater implements Eater {
        boolean hasEaten = false;

        @Override
        public void eat(Edible edible) {
            this.hasEaten = true;
        }
    }
    
    @Test
    void testEat() {

        TestEater eater = new TestEater();
        Edible food = new TestFood();

        eater.eat(food);

        assertTrue(eater.hasEaten, "Eater should have eaten the food");
    }
}
