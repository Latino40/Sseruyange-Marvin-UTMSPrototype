package com.mycompany.utmsprototype;
public class Student extends User {
    public Student(String userId, String name) {
        super(userId, name);
    }

    @Override
    public void requestTransport() {
        System.out.println("Student requesting transport for academic purpose.");
    }
}
