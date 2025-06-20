package com.mycompany.utmsprototype;

public class Route {
    private final String routeId;
    private final String origin;
    private final String destination;
    private final int estimatedTime;

    public Route(String routeId, String origin, String destination, int estimatedTime) {
        this.routeId = routeId;
        this.origin = origin;
        this.destination = destination;
        this.estimatedTime = estimatedTime;
    }

    public void displayRouteInfo() {
        System.out.println("Route ID: " + routeId);
        System.out.println("From: " + origin + " To: " + destination);
        System.out.println("Estimated Travel Time: " + estimatedTime + " minutes");
    }
}