package com.mycompany.utmsprototype;
public class TransportAssignment {
    public void assignDriver(String vehicleType) {
        System.out.println("Assigning driver by vehicle type: " + vehicleType);
    }

    public void assignDriver(String vehicleType, String shiftTime) {
        System.out.println("Assigning driver for " + vehicleType + " during " + shiftTime + " shift.");
    }
}
