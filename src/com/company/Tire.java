package com.company;

public class Tire { // figure out a use case for decrementing pressure
    public int diameter;
    public int pressure;
    public int stockPressure;

    public Tire(int diameter, int pressure){ // actually do something with these values
        this.diameter = diameter;
        this.pressure = pressure;
        stockPressure = pressure;
    }

    public void fill(){
        pressure = stockPressure;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "diameter=" + diameter +
                ", pressure=" + pressure +
                '}';
    }
}
