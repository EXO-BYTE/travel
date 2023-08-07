package Travellapp.travel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*class Location {
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

class TicketBookingRequest {
    private String location;
    private String customerName;
    private String paymentStatus;
    // Other ticket booking request details

    public TicketBookingRequest(String location, String customerName) {
        this.location = location;
        this.customerName = customerName;
        this.paymentStatus = "Pending";
    }

    // Getters and setters for other properties

    public void setPaymentStatus(String status) {
        this.paymentStatus = status;
    }
}

class Admin {
    private Map<String, Location> locations;
    private List<TicketBookingRequest> ticketBookingRequests;
    private List<String> feedbacks;
    // Other admin-related properties and methods

    public Admin() {
        this.locations = new HashMap<>();
        this.ticketBookingRequests = new ArrayList<>();
        this.feedbacks = new ArrayList<>();
    }

    public void addLocation(String name) {
        locations.put(name, new Location(name));
    }

    public void addHotelToLocation(String locationName, String hotel) {
        locations.get(locationName).addHotel(hotel);
    }

    public void addCabToLocation(String locationName, String cab) {
        locations.get(locationName).addCab(cab);
    }

    public void addTouristSpotToLocation(String locationName, String spot) {
        locations.get(locationName).addTouristSpot(spot);
    }

    public void viewTicketBookingRequests() {
        for (TicketBookingRequest request : ticketBookingRequests) {
            System.out.println("Location: " + request.getLocation());
            System.out.println("Customer Name: " + request.getCustomerName());
            System.out.println("Payment Status: " + request.getPaymentStatus());
            // Print other details of the request
        }
    }

    public void confirmTicketBooking(String location, String customerName) {
        for (TicketBookingRequest request : ticketBookingRequests) {
            if (request.getLocation().equals(location) && request.getCustomerName().equals(customerName)) {
                request.setPaymentStatus("Confirmed");
                break;
            }
        }
    }

    public void rejectTicketBooking(String location, String customerName) {
        for (TicketBookingRequest request : ticketBookingRequests) {
            if (request.getLocation().equals(location) && request.getCustomerName().equals(customerName)) {
                request.setPaymentStatus("Rejected");
                break;
            }
        }
    }

    public void monitorPaymentStatus() {
        for (TicketBookingRequest request : ticketBookingRequests) {
            System.out.println("Location: " + request.getLocation());
            System.out.println("Customer Name: " + request.getCustomerName());
            System.out.println("Payment Status: " + request.getPaymentStatus());
            // Print other details of the request
        }
    }

    public void viewFeedbacks() {
        for (String feedback : feedbacks) {
            System.out.println(feedback);
        }
    }
}*/

public class travelapp {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.addLocation("New York");
        admin.addHotelToLocation("New York", "Hotel A");
        admin.addHotelToLocation("New York", "Hotel B");
        admin.addCabToLocation("New York", "Cab X");
        admin.addCabToLocation("New York", "Cab Y");
        admin.addTouristSpotToLocation("New York", "Statue of Liberty");

        TicketBookingRequest request1 = new TicketBookingRequest("New York", "John Doe");
        TicketBookingRequest request2 = new TicketBookingRequest("New York", "Jane Smith");

        admin.ticketBookingRequests.add(request1);
        admin.ticketBookingRequests.add(request2);

        admin.viewTicketBookingRequests();

        admin.confirmTicketBooking("New York", "John Doe");
        admin.rejectTicketBooking("New York", "Jane Smith");

        admin.monitorPaymentStatus();

        // Collect feedback from customers and add to admin.feedbacks
        admin.feedbacks.add("Great service! Loved the hotel and the city.");

        admin.viewFeedbacks();
    }
}