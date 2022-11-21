package com.builder;

public class CarBuilder {

    private String engine;
    private int doors;
    private int seats;
    private String parkingSensor;
    private String fogLights;
    private String battery;

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public CarBuilder setParkingSensor(String parkingSensor) {
        this.parkingSensor = parkingSensor;
        return this;
    }

    public CarBuilder setFogLights(String fogLights) {
        this.fogLights = fogLights;
        return this;
    }

    public CarBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public Car build() {
        return new Car(engine, doors, seats, parkingSensor, fogLights, battery);
    }

}
