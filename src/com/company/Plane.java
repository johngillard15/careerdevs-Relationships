package com.company;

import java.util.ArrayList;
import java.util.List;

public class Plane extends Vehicle {
    boolean isLanding = true; // true = landing gear down

    public Plane(String engineType, int maxPassengers){
        super(engineType, "Plane", false, false, true, false, maxPassengers);
    }

    public void toggleLanding(){
        isLanding = !isLanding;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "tires=" + tireCount +
                ", isLanding=" + isLanding +
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
