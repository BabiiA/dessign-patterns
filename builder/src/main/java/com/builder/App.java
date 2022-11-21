package com.builder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car("SimpleEngine", 4, 4, null, null, null);
        Car car1 = new CarBuilder()
                .setEngine("SimpleEngine")
                .setDoors(4)
                .setSeats(4)
                .build();
    }
}
