package com.mycompany.utmsprototype;
import java.util.ArrayList;
import java.util.List;

public class DriverManager {
    private final List<Driver> drivers = new ArrayList<>();

    public void addDriver(Driver driver) {
        drivers.add(driver);
        System.out.println("Driver added: " + driver.getName());
    }

    public void listDrivers() {
        System.out.println("-- Registered Drivers --");
        for (Driver d : drivers) {
            System.out.println("ID: " + d.getDriverId() + ", Name: " + d.getName() + ", License: " + d.getLicenseNumber());
        }
    }

    public Driver findDriverById(String driverId) {
        for (Driver d : drivers) {
            if (d.getDriverId().equalsIgnoreCase(driverId)) {
                return d;
            }
        }
        return null;
    }
}
