package com.company;

public class Engine {
    public String type;
    public boolean isOn = false;
    public int fuel = 100; // use this somewhere eventually

    public Engine(String type){
        this.type = type;
    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", isOn=" + isOn +
                ", fuel=" + fuel +
                "%}";
    }
}
