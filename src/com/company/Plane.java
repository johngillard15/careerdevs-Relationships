package com.company;

import java.util.ArrayList;
import java.util.List;

public class Plane extends Vehicle {
    List<Tire> tires = new ArrayList<>();
    boolean isLanding;

    public Plane(String engineType, int maxPassengers){
        super(engineType, "Plane", false, false, true, false, maxPassengers);
    }

    public void toggleLanding(){
        isLanding = !isLanding;
    }

    public void addTire(int diameter, int pressure){
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
        return "Plane{" +
                "tires=" + tires +
                ",\n\tisLanding=" + isLanding +
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
