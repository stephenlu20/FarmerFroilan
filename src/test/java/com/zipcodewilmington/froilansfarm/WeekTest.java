package com.zipcodewilmington.froilansfarm;
import org.junit.jupiter.api.Test;

public class WeekTest {
    private Farm farm = new Farm();
    private Farmer froilan = (Farmer) farm.getFarmHouse().get(0);
    private Pilot froilanda = (Pilot) farm.getFarmHouse().get(1);
    private CropDuster cropDuster = new CropDuster();

    @Test
    public void simulateWeek() {
        initializeFarm();

        sunday();
        monday();
        tuesday();
        wednesday();
        thursday();
        friday();
        saturday();
    }

    private void initializeFarm() {
        // add five empty rows to field on farm
        for (int i = 0; i < 5; i++) {
            farm.getField().addRow(null);
        }
    }

    private void sunday() {
        morningRoutine();
        // Fill out what froilan and froilanda do on sunday
    }

    private void monday() {
        morningRoutine();
        // Fill out what froilan and froilanda do

    }

    private void tuesday() {
        morningRoutine();
        // Fill out what froilan and froilanda do

    }

    private void wednesday() {
        morningRoutine();
        // Fill out what froilan and froilanda do

    }

    private void thursday() {
        morningRoutine();

        

        froilanda.mount(cropDuster);
        froilanda.fly(cropDuster);

        cropDuster.fertilize(farm.getField().getRows().get(3));
        cropDuster.fertilize(farm.getField().getRows().get(4));


        froilanda.dismount(cropDuster);

       




        // Fill out what froilan and froilanda do

    }

    
    

    private void friday() {
        morningRoutine();
        // Fill out what froilan and froilanda do

    }

    private void saturday() {
        morningRoutine();
        // Fill out what froilan and froilanda do

    }

    protected void morningRoutine() {
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
