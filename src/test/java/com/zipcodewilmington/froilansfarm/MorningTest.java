package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

public class MorningTest {
    Farm farm = new Farm();
    Farmer froilan = (Farmer) farm.getFarmHouse().get(0);
    Pilot froilanda = (Pilot) farm.getFarmHouse().get(1);

    @Test
    protected void performMorningRoutine() {
        rideAllHorses();
        feedAllHorses();
        eatBreakfast();
    }

    private void rideAllHorses() {
        for (Stable stable : farm.getStables()) {
            for (Horse horse : stable.getAll()) {
                froilan.mount(horse);
                froilan.dismount(horse);
                froilanda.mount(horse);
                froilanda.dismount(horse);
            }
        }
    }

    private void feedAllHorses() {
        for (Stable stable : farm.getStables()) {
            for (Horse horse : stable.getAll()) {
                for (int i = 0; i < 3; i++) {
                    EarCorn corn = new EarCorn();
                    horse.eat(corn);
                }
            }
        }
    }

    private void eatBreakfast() {
        // Froilan
        froilan.eat(new EarCorn());
        froilan.eat(new Tomato());
        froilan.eat(new Tomato());
        for (int i = 0; i < 5; i++) froilan.eat(new Egg(false));

        // Froilanda
        froilanda.eat(new EarCorn());
        froilanda.eat(new EarCorn());
        froilanda.eat(new Tomato());
        froilanda.eat(new Egg(false));
        froilanda.eat(new Egg(false));
    }
    
}
