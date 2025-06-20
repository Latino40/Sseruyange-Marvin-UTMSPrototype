package com.mycompany.utmsprototype;

public class Lecturer extends User {
    public Lecturer(String userId, String name) {
        super(userId, name);
    }

    @Override
    public void requestTransport() {
        System.out.println("Lecturer requesting transport for teaching.");
    }
}
