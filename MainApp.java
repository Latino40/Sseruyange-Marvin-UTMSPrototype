
package com.mycompany.utmsprototype;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        // === Students ===
        List<Student> students = new ArrayList<>();
        System.out.print("How many students do you want to enter? ");
        int numStudents = Integer.parseInt(Scanner.nextLine());
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Enter Student ID: ");
            String sid = Scanner.nextLine();
            System.out.print("Enter Student Name: ");
            String sname = Scanner.nextLine();
            Student student = new Student(sid, sname);
            students.add(student);
            student.requestTransport();
        }

        // === Lecturers ===
        List<Lecturer> lecturers = new ArrayList<>();
        System.out.print("How many lecturers do you want to enter? ");
        int numLecturers = Integer.parseInt(Scanner.nextLine());
        for (int i = 0; i < numLecturers; i++) {
            System.out.println("Enter details for Lecturer " + (i + 1) + ":");
            System.out.print("Enter Lecturer ID: ");
            String lid = Scanner.nextLine();
            System.out.print("Enter Lecturer Name: ");
            String lname = Scanner.nextLine();
            Lecturer lecturer = new Lecturer(lid, lname);
            lecturers.add(lecturer);
            lecturer.requestTransport();
        }

        // === Route Choice ===
        System.out.println("Choose a route from the options below:");
        System.out.println("1. Campus to Hostel");
        System.out.println("2. Campus to Main Library");
        System.out.println("3. Campus to Town Centre");
        System.out.print("Enter route number: ");
        int routeChoice = Integer.parseInt(Scanner.nextLine());
        String shiftTime = "Morning";
        Route selectedRoute;
        switch (routeChoice) {
            case 1 -> selectedRoute = new Route("R001", "Campus", "Hostel", 15);
            case 2 -> selectedRoute = new Route("R002", "Campus", "Main Library", 10);
            case 3 -> selectedRoute = new Route("R003", "Campus", "Town Centre", 25);
            default -> {
                System.out.println("Invalid choice. Defaulting to Route 1.");
                selectedRoute = new Route("R001", "Campus", "Hostel", 15);
            }
        }
        selectedRoute.displayRouteInfo();

        // === Choose shift time ===
        System.out.println("Choose time of day for transport (Morning, Evening, Night): ");
        shiftTime = Scanner.nextLine();

        // === Vehicles ===
        List<Vehicle> vehicles = new ArrayList<>();
        System.out.print("How many vehicles do you want to enter? ");
        int numVehicles = Integer.parseInt(Scanner.nextLine());
        for (int i = 0; i < numVehicles; i++) {
            System.out.println("Enter details for Vehicle " + (i + 1) + ":");
            System.out.print("Enter Vehicle ID: ");
            String vid = Scanner.nextLine();
            System.out.print("Enter Vehicle Model: ");
            String vmodel = Scanner.nextLine();
            System.out.print("Enter License Plate: ");
            String vplate = Scanner.nextLine();
            Vehicle vehicle = (i % 2 == 0) ? new Bus(vid, vmodel, vplate) : new Van(vid, vmodel, vplate);
            vehicles.add(vehicle);
            vehicle.serviceVehicle();
            vehicle.trackLocation();
            vehicle.schedule();
        }

        // === Drivers ===
        DriverManager dm = new DriverManager();
        System.out.print("How many drivers do you want to enter? ");
        int numDrivers = Integer.parseInt(Scanner.nextLine());
        for (int i = 0; i < numDrivers; i++) {
            System.out.println("Enter details for Driver " + (i + 1) + ":");
            System.out.print("Enter Driver ID: ");
            String did = Scanner.nextLine();
            System.out.print("Enter Driver Name: ");
            String dname = Scanner.nextLine();
            System.out.print("Enter License Number: ");
            String dlicense = Scanner.nextLine();
            Driver driver = new Driver(did, dname, dlicense);
            dm.addDriver(driver);
        }

        dm.listDrivers();

        // === Assignments ===
        TransportAssignment assign = new TransportAssignment();
        assign.assignDriver("Bus", shiftTime);
        assign.assignDriver("Van", shiftTime);

        System.out.println("\n\n=== THANK YOU FOR USING VICTORIA UNIVERSITY TRANSPORT MANAGEMENT SYSTEM ===");
        Scanner.close();
    }
}