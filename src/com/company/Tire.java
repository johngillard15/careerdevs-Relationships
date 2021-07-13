package com.company;

public class Tire {
    public int diameter;
    public int pressure;

    public Tire(int diameter, int pressure){
        this.diameter = diameter;
        this.pressure = pressure;
    }

    public void fill(){
        pressure = 0;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "diameter=" + diameter +
                ", pressure=" + pressure +
                '}';
    }
}
