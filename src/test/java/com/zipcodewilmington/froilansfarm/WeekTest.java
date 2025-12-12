package com.zipcodewilmington.froilansfarm;
import org.junit.jupiter.api.Test;
import com.zipcodewilmington.froilansfarm.Interfaces.CropRow;

public class WeekTest {
    private Farm farm = new Farm();
    private Farmer froilan = (Farmer) farm.getFarmHouse().get(0);
    private Pilot froilanda = (Pilot) farm.getFarmHouse().get(1);

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
        CropRow row1 = farm.getField().getRows().get(0);
        CropRow row2 = farm.getField().getRows().get(1);
        CropRow row3 = farm.getField().getRows().get(2);
        
        for (int i = 0; i < 10; i++) {
            froilan.plant(new CornStalk(), row1);
        }

        for (int i = 0; i < 10; i++) {
            froilan.plant(new TomatoPlant(), row2);
        }

        for (int i = 0; i < 10; i++) {
            froilan.plant(new CarrotPlant(), row3);
        }
    }

    private void monday() {
        morningRoutine();
        // Fill out what froilan and froilanda do

    }

    private void tuesday() {
        morningRoutine();
        
        Tractor tractor = new Tractor();

        CropRow row1= farm.getField().getRows().get(0);
        CropRow row2 = farm.getField().getRows().get(1);
        CropRow row3 = farm.getField().getRows().get(2);

        tractor.harvestCropRow(row1);
        tractor.harvestCropRow(row2);
        tractor.harvestCropRow(row3);
    }

    private void wednesday() {
        morningRoutine();
        CropRow row4 = farm.getField().getRows().get(4);
        CropRow row5 = farm.getField().getRows().get(5);
        
        for (int i = 0; i < 10; i++) {
            froilan.plant(new CornStalk(), row4);
        }

        for (int i = 0; i < 10; i++) {
            froilan.plant(new TomatoPlant(), row5);
        }
    }  
        
    

    private void thursday() {
        morningRoutine();
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
