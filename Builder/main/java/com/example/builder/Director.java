package org.example;

public class Director {
    public void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeats(5);
        builder.setEngine("SUV");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void makeSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("Sport");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }
}