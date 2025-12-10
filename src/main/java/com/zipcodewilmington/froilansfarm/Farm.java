package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    
    private FarmHouse farmHouse;
    private List<Stable> stables;
    private List<ChickenCoop> chickenCoops;
    private Field field;

    public Farm() {
        this.farmHouse = new FarmHouse();
        this.stables = new ArrayList<>();
        this.chickenCoops = new ArrayList<>();
        this.field = new Field();

        setupFarm();
    }

    private void setupFarm() {
        Farmer froilan = new Farmer("Froilan");
        Pilot froilanda = new Pilot("Froilanda");
        farmHouse.add(froilan);
        farmHouse.add(froilanda);

        Stable stable1 = new Stable("Stable 1");
        Stable stable2 = new Stable("Stable 2");
        Stable stable3 = new Stable("Stable 3");

        for (int i = 0; i < 4; i++) {
            stable1.add(new Horse("Horse" + i));
        }
        for (int i = 4; i < 7; i++) {
            stable2.add(new Horse("Horse" + i));
        }
        for (int i = 7; i < 10; i++) {
            stable3.add(new Horse("Horse" + i));
        }

        stables.add(stable1);
        stables.add(stable2);
        stables.add(stable3);

        ChickenCoop coop1 = new ChickenCoop("Coop 1");
        ChickenCoop coop2 = new ChickenCoop("Coop 2");
        ChickenCoop coop3 = new ChickenCoop("Coop 3");
        ChickenCoop coop4 = new ChickenCoop("coop 4");
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public List<Stable> getStables() {
        return stables;
    }

    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public Field getField() {
        return field;
    }

    public List<Horse> getAllHorses() {
        List<Horse> allHorses = new ArrayList<>();
        for (Stable stable : stables) {
            allHorses.addAll(stable.getAll());
        }
        return allHorses;
    }

    public List<Chicken> getAllChickens() {
        List<Chicken> allChickens = new ArrayList<>();
        for (ChickenCoop coop : chickenCoops) {
            allChickens.addAll(coop.getAll());
        }
        return allChickens;
    }

    public int getTotalHorses() {
        return getAllHorses().size();
    }

    public int getTotalChickens() {
        return getAllChickens().size();
    }

    @Override
    public String toString() {
        return "Farm [" + getTotalHorses() + " horses, " + getTotalChickens() + " chickens, " + farmHouse.size() + " residents]";
    }
}
