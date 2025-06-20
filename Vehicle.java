package com.mycompany.utmsprototype;

public class Vehicle implements Serviceable, Trackable, Schedulable {
    private final String vehicleId;
    private final String model;
    private final String licensePlate;

    public Vehicle(String vehicleId, String model, String licensePlate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public void serviceVehicle() {
        System.out.println("Servicing vehicle: " + model);
    }

    @Override
    public void trackLocation() {
        System.out.println("Tracking vehicle location...");
    }

    public void schedule() {
        System.out.println("Scheduling vehicle for a route.");
    }

    @Override
    public boolean scheduleTrip(String routeName, String time) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}