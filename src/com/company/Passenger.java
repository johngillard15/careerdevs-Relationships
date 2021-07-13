package com.company;

public class Passenger {
    public String name;
    public int weight;

    public Passenger(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
