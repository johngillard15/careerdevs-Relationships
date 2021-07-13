package com.company;

public class Boat extends Vehicle {
    int maxLoad;

    public Boat(String engineType, int maxPassengers, int maxLoad){
        super(engineType, "Boat", false, true, false, false, maxPassengers);
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "maxLoad=" + maxLoad +
                ", engine=" + engine +
                ", type='" + type + '\'' +
                ", isLand=" + isLand +
                ", isWater=" + isWater +
                ", isAir=" + isAir +
                ", isSpace=" + isSpace +
                ", passengers=" + passengers +
                ", maxPassengers=" + maxPassengers +
                '}';
    }
}
