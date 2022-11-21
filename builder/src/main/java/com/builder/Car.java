package com.builder;

public class Car {

    private String engine;
    private int doors;
    private int seats;
    private String parkingSensor;
    private String fogLights;
    private String battery;

    public Car(String engine, int doors, int seats, String parkingSensor, String fogLights, String battery) {
        this.engine = engine;
        this.doors = doors;
        this.seats = seats;
        this.parkingSensor = parkingSensor;
        this.fogLights = fogLights;
        this.battery = battery;
    }

}
