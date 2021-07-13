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

    public void turnOn(){
        engine.isOn = true;
    }

    public void turnOff(){
        engine.isOn = false;
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
}
