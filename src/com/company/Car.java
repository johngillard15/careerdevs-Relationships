package com.company;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle{

    public Car(String engineType, int maxPassengers){
        super(engineType, "Car", true, false, false, false, maxPassengers);
    }

    @Override
    public String toString() {
        return "Car{" +
                "tires=" + tireCount +
                ", engine=" + engine +
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
