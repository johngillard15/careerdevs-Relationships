package com.company;

public class Boat extends Vehicle {
    int maxLoad;

    public Boat(String engineType, int maxPassengers, int maxLoad){
        super(engineType, "Boat", false, true, false, false, maxPassengers);
        this.maxLoad = maxLoad;
    }

    public void addPassenger(String name, int weight){
        int currentWeight = 0;
        for(Passenger passenger : passengers)
            currentWeight += passenger.weight;

        if(passengers.size() >= maxPassengers)
            System.out.printf("Maximum passenger limit of %d reached, cannot add \"%s\"\n", maxPassengers, name);
        else if(currentWeight + weight > maxLoad)
            System.out.printf("Maximum load limit of %d reached, cannot add \"%s\"\n", maxLoad, name);
        else
            passengers.add(new Passenger(name, weight));
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
                ",\n\tpassengers=" + passengers +
                ",\n\tmaxPassengers=" + maxPassengers +
                '}';
    }
}
