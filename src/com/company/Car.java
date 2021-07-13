package com.company;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle{
    List<Tire> tires = new ArrayList<>();
    int tireCount;

    public Car(String engineType, int maxPassengers){
        super(engineType, "Car", true, false, false, false, maxPassengers);
    }

    public void addTire(int diameter, int pressure){
        tires.add(new Tire(diameter, pressure));
    }

    public void addTire(int tireCount, int diameter, int pressure){
        for(int i = 0; i < tireCount; i++)
            tires.add(new Tire(diameter, pressure));
    }

    public void removeTire(int index){
        tires.remove(index);
    }

    public void replaceTire(int index){
        //tires.get(index);
    }

    @Override
    public String toString() {
        return "Car{" +
                "tires=" + tires +
                ",\n\tengine=" + engine +
                ", type='" + type + '\'' +
                ", isLand=" + isLand +
                ", isWater=" + isWater +
                ", isAir=" + isAir +
                ", isSpace=" + isSpace +
                ",\n\tpassengers=" + passengers +
                ",\n\tmaxPassengers=" + maxPassengers +
                '}';
    }
}
