package com.mycompany.utmsprototype;
public class TransportOfficer extends User {
    public TransportOfficer(String userId, String name) {
        super(userId, name);
    }

    @Override
    public void requestTransport() {
        System.out.println("Transport officer managing transport logistics.");
    }
}