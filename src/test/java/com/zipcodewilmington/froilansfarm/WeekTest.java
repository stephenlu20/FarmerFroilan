package com.zipcodewilmington.froilansfarm;
import org.junit.jupiter.api.Test;
import com.zipcodewilmington.froilansfarm.Interfaces.CropRow;
import static org.junit.jupiter.api.Assertions.*;

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
            farm.getField().addRow(new CropRow());
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
    
    froilanda.mount(cropDuster);
    froilanda.fly(cropDuster);
    
    for (int i = 0; i < 3; i++) {
        for (Crop crop : farm.getField().getRow(i).getCrops()) {
            crop.setHasBeenFertilized(true);
        }
    }
    
    froilanda.dismount(cropDuster);

    int count = 0;
    for (int i = 0; i < 3; i++) {
        for (Crop crop : farm.getField().getRow(i).getCrops()) {
            if (crop.getHasBeenFertilized()) count++;
        }
    }
    assertEquals(30, count);
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
        CropRow row3 = farm.getField().getRows().get(3);
        CropRow row4 = farm.getField().getRows().get(4);
        
        for (int i = 0; i < 10; i++) {
            froilan.plant(new CornStalk(), row3);
        }

        for (int i = 0; i < 10; i++) {
            froilan.plant(new TomatoPlant(), row4);
        }
    }  
        
    

    private void thursday() {
        morningRoutine();
        // Fill out what froilan and froilanda do

    }

    private void friday() {
        morningRoutine();
        
        Tractor tractor = new Tractor();

        CropRow row4= farm.getField().getRows().get(3);
        CropRow row5 = farm.getField().getRows().get(4);
        
        tractor.harvestCropRow(row4);
        tractor.harvestCropRow(row5);
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
