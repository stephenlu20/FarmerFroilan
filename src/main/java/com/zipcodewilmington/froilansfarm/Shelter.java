package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal;
import java.util.ArrayList;
import java.util.List;


public class Shelter<T extends Animal> {

    private List<T> animals;
    private String name;
    private int capacity;

    public shelter() {
        this.animals = new ArrayList<>();
        this.name = "Unnamed Shelter";
        this.capacity = Integer.MAX_VALUE;
    }

    public Shelter(String name) {
        this.animals = new ArrayList<>();
        this.name = name;
        this.capacity = Integer.MAX_VALUE;
    }

    public Shelter(String name, int capacity) {
        this.animals = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }

    public boolean add(T animal) {
        if (animals.size() >= capacity) {
            return false;
        }
        return animals.add(animal);
    }

    public boolean remove(T animal) {
        return animals.remove(animal);
    }

    public List<T> getAll() {
        return new ArrayList<>(animals);
    }

    public T get(int index) {
        if (index >= 0 && index < animals.size()) {
            return animals.get(index);
        }
        return null;
    }

    public int size() {
        return animals.size();
    }

    public boolean isEmpty() {
        return animals.isEmpty();
    }

    public boolean isFull() {
        return animals.size() >= capacity;
    }

    public int getAvailableSpace() {
        return capacity - animals.size();
    }

    public void clear() {
        animals.clear();
    }

    public boolean contains(T animal) {
        return animals.contains(animal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " [" + animals.size() + "/" + capacity + " animals]";
    }
}

    

