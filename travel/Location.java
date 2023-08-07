package Travellapp.travel;

import java.util.ArrayList;
import java.util.List;

class Location {
    private String name;
    private List<String> hotels;
    private List<String> cabs;
    private List<String> touristSpots;
    // Other location-related information and services

    public Location(String name) {
        this.name = name;
        this.hotels = new ArrayList<>();
        this.cabs = new ArrayList<>();
        this.touristSpots = new ArrayList<>();
    }

    // Getters and setters for other properties

    public void addHotel(String hotel) {
        hotels.add(hotel);
    }

    public void addCab(String cab) {
        cabs.add(cab);
    }

    public void addTouristSpot(String spot) {
        touristSpots.add(spot);
    }
}