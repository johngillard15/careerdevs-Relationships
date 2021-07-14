package com.company;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    Engine engine;
    String type;
    boolean isLand;
    boolean isWater;
    boolean isAir;
    boolean isSpace;
    List<Passenger> passengers = new ArrayList<>();
    int maxPassengers;
    List<Tire> tires = new ArrayList<>();
    int tireCount;

    public Vehicle(String engineType, String type, boolean isLand, boolean isWater, boolean isAir, boolean isSpace,
                   int maxPassengers){
        engine = new Engine(engineType);
        this.type = type;
        this.isLand = isLand;
        this.isWater = isWater;
        this.isAir = isAir;
        this.isSpace = isSpace;
        this.maxPassengers = maxPassengers;
    }

    public void addPassenger(String name, int weight){
        if(passengers.size() >= maxPassengers)
            System.out.printf("Maximum passenger limit of %d reached, cannot add \"%s\"\n", maxPassengers, name);
        else
            passengers.add(new Passenger(name, weight));
    }

    public void removePassenger(String name){
        passengers.removeIf(passenger -> passenger.name.equals(name));
    }

    public void addTire(int diameter, int pressure){
        tires.add(new Tire(diameter, pressure));
    }

    public void addTire(int diameter, int pressure, int tireCount){
        for(int i = 0; i < tireCount; i++)
            tires.add(new Tire(diameter, pressure));
        this.tireCount = tireCount;
    }

    public void removeTire(int index){
        tires.remove(index);
    }

    public void replaceTire(int index){
        //tires.get(index);
    }
}
