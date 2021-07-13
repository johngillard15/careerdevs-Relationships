package com.company;

/**
 * <h1>Java Practice: Relationships</h1>
 *
 * <p>For this exercise the focus is to get a better understanding of the two Object relationships we have available to us. Is A and Has A relationships.
 * Both fall under the inheritance pillar however the Is A relationship more reflects the parental inheritance we are used to where
 * the Fields and Methods are carried from the Parent class to the Child class.
 * The Has A relationship is called Composition a good way to remember this is to ask if an object is composed of another object.
 * For example a Car is composed of an engine, tires and doors. However a Car is not an engine and an engine is not a car so that is a composition based relationship.
 * For the following exercise here is the goal. Create the classes as instructed.
 * In the end you want to be able to instantiate the specific items mentioned at the end.
 * Important: read through all the classes first and determine the relationships the classes have.
 * Due to composition you may need to make other classes first before you can make others. I will also not clarify the Composition and Inheritance relationships.
 * Looking at the classes try to determine how they connect.</p>
 * <br>
 * <p>The main focus of this exercise is getting this to compile and run, it's not about making the output pretty.
 * Once it runs and doesn't crash you may add in display systems that can display what type of vehicle it is and what passengers it has etc.</p>
 * <br>
 * <p>you should be able to instantiate the following items</p>
 * <p>an electric and a gas engine</p>
 * <p>a Car with 4 tires and an engine</p>
 * <p>a Boat with an engine</p>
 * <p>a Plane with 6 tires (two tires on three points technically) and an engine</p>
 * <br>
 * <p>Multiple people that then can be added to your vehicles.</p>
 * <br>
 * <p>additional challenges</p>
 * <br>
 *
 * @since 12/7/2021
 * @author John Gillard
 */

public class Main {

    public static void main(String[] args) {
        // Electric Motor
        Engine evMotor = new Engine("Electric Motor");
        System.out.println(evMotor);

        // Gas Engine
        System.out.println();
        Engine gasEngine = new Engine("Gas Engine");
        System.out.println(gasEngine);

        // a Car with 4 tires and an engine
        System.out.println();
        Car car = new Car("V6", 5);
        for(int i = 0; i < 4; i++)
            car.addTire(18, 36);
        //String[] carPassengers = {"Joe", "Moe"};
        car.addPassenger("Joe", 170);
        car.addPassenger("Moe", 210);
        car.addPassenger("Alex", 150);
        car.addPassenger("Josh", 180);
        car.addPassenger("Mike", 230);
        car.addPassenger("Max", 123);
        System.out.println(car);

        // a Boat with an engine
        System.out.println();
        Boat boat = new Boat("V8", 7, 10_000);
        boat.passengers.add(new Passenger("Joe", 170));
        boat.passengers.add(new Passenger("Moe", 210));
        System.out.println(boat);

        // a Plane with 6 tires (two tires on three points technically) and an engine
        System.out.println();
        Plane plane = new Plane("Turboprop", 20);
        for(int i = 0; i < 6; i++)
            plane.addTire(27, 80);
        plane.passengers.add(new Passenger("Joe", 170));
        plane.passengers.add(new Passenger("Moe", 210));
        System.out.println(plane);
    }
}
